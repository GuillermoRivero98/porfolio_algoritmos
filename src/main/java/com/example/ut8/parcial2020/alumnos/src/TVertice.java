package com.example.ut8.parcial2020.alumnos.src;

import java.util.LinkedList;
import java.util.Queue;

public class TVertice implements IVertice {

    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes = new LinkedList<>();
    private boolean visitado;
    private int numDist;

    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        this.visitado = false;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    public boolean getVisitado() {
        return this.visitado;
    }

    public int getNumDist() {
        return numDist;
    }

    public void setNumDist(int numDist) {
        this.numDist = numDist;
    }

    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        if (verticeDestino != null) {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().getEtiqueta().compareTo(etiquetaDestino) == 0) {
                return adyacencia;
            }
        }
        return null;
    }

    @Override
    public boolean eliminarAdyacencia(Comparable nomVerticeDestino) {
        TAdyacencia ady = buscarAdyacencia(nomVerticeDestino);
        if (ady != null) {
            adyacentes.remove(ady);
            return true;
        }
        return false;
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
    public Double obtenerCostoAdyacencia(TVertice verticeDestino) {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null) {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }

    @Override
    public TVertice primerAdyacente() {
        if (!adyacentes.isEmpty()) {
            return adyacentes.getFirst().getDestino();
        }
        return null;
    }

    @Override
    public TVertice siguienteAdyacente(TVertice w) {
        TAdyacencia adyacente = buscarAdyacencia(w.getEtiqueta());
        int index = adyacentes.indexOf(adyacente);
        if (index + 1 < adyacentes.size()) {
            return adyacentes.get(index + 1).getDestino();
        }
        return null;
    }

    @Override
    public void obtenerAnillos(TAnillosContagio losAnillos, int maxDistancia) {
        Queue<TVertice> queue = new LinkedList<>();
        this.setVisitado(true);
        this.setNumDist(0);
        queue.add(this);
        while (!queue.isEmpty()) {
            TVertice vertice = queue.poll();
            for (TAdyacencia adyacencia : vertice.getAdyacentes()) {
                TVertice adyacente = adyacencia.getDestino();
                if (!adyacente.getVisitado()) {
                    adyacente.setVisitado(true);
                    adyacente.setNumDist(vertice.getNumDist() + 1);
                    if (adyacente.getNumDist() <= maxDistancia) {
                        losAnillos.agregarVertice(adyacente, vertice);
                        queue.add(adyacente);
                    }
                }
            }
        }
    }
}
