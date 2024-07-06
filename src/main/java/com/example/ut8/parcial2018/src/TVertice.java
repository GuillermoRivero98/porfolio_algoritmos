package com.example.ut8.parcial2018.src;
import java.util.Collection;
import java.util.LinkedList;

public class TVertice implements IVertice, IVerticeKevinBacon {

    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private int numBacon = 0;
    private Object datos;

    public int getNumBacon() {
        return numBacon;
    }

    public void setNumBacon(int numBacon) {
        this.numBacon = numBacon;
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList<>();
        visitado = false;
    }

    @Override
    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    @Override
    public boolean getVisitado() {
        return this.visitado;
    }

    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().equals(verticeDestino)) {
                return adyacencia;
            }
        }
        return null;
    }

    @Override
    public Double obtenerCostoAdyacencia(TVertice verticeDestino) {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null) {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }

    @Override
    public boolean insertarAdyacencia(Double costo, TVertice verticeDestino) {
        if (buscarAdyacencia(verticeDestino) == null) {
            TAdyacencia ady = new TAdyacencia(costo, verticeDestino);
            return adyacentes.add(ady);
        }
        return false;
    }

    @Override
    public boolean eliminarAdyacencia(Comparable etiquetaDestino) {
        TAdyacencia ady = buscarAdyacencia(etiquetaDestino);
        if (ady != null) {
            adyacentes.remove(ady);
            return true;
        }
        return false;
    }

    @Override
    public TVertice primerAdyacente() {
        if (!adyacentes.isEmpty()) {
            return adyacentes.getFirst().getDestino();
        }
        return null;
    }

    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().getEtiqueta().equals(etiquetaDestino)) {
                return adyacencia;
            }
        }
        return null;
    }

    @Override
    public Object getDatos() {
        return datos;
    }

    @Override
    public void bpf(Collection<TVertice> visitados) {
        // Implementación del recorrido en profundidad (DFS)
        visitados.add(this);
        setVisitado(true);
        for (TAdyacencia adyacente : adyacentes) {
            TVertice destino = adyacente.getDestino();
            if (!destino.getVisitado()) {
                destino.bpf(visitados);
            }
        }
    }

    @Override
    public TCaminos todosLosCaminos(Comparable etVertDest, TCamino caminoPrevio, TCaminos todosLosCaminos) {
        // Implementación para encontrar todos los caminos entre este vértice y un destino dado
        return null;
    }

    @Override
    public boolean tieneCiclo(TCamino camino) {
        // Implementación para verificar si hay un ciclo que incluya este vértice
        return false;
    }

    @Override
    public void bea(Collection<TVertice> visitados) {
        // Implementación del recorrido en amplitud (BFS)
        LinkedList<TVertice> cola = new LinkedList<>();
        cola.add(this);
        setVisitado(true);
        while (!cola.isEmpty()) {
            TVertice actual = cola.poll();
            visitados.add(actual);
            for (TAdyacencia adyacente : actual.getAdyacentes()) {
                TVertice destino = adyacente.getDestino();
                if (!destino.getVisitado()) {
                    destino.setVisitado(true);
                    cola.add(destino);
                }
            }
        }
    }

    @Override
    public void listarContactos(Collection<TVertice> visitados, int maxSaltos) {
        // Implementación para listar los contactos hasta una cierta cantidad de saltos
        LinkedList<TVertice> cola = new LinkedList<>();
        cola.add(this);
        setVisitado(true);
        int saltosActuales = 0;
        while (!cola.isEmpty() && saltosActuales <= maxSaltos) {
            int size = cola.size();
            for (int i = 0; i < size; i++) {
                TVertice actual = cola.poll();
                visitados.add(actual);
                for (TAdyacencia adyacente : actual.getAdyacentes()) {
                    TVertice destino = adyacente.getDestino();
                    if (!destino.getVisitado()) {
                        destino.setVisitado(true);
                        cola.add(destino);
                    }
                }
            }
            saltosActuales++;
        }
    }
}
