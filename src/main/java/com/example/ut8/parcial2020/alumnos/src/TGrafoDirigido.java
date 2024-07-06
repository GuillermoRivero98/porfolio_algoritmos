package com.example.ut8.parcial2020.alumnos.src;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TGrafoDirigido implements IGrafoDirigido {

    private Map<Comparable, TVertice> vertices;

    public TGrafoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        this.vertices = new HashMap<>();
        for (TVertice vertice : vertices) {
            insertarVertice(vertice);
        }
        for (TArista arista : aristas) {
            insertarArista(arista);
        }
    }

    @Override
    public boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino) {
        if (nomVerticeOrigen != null && nomVerticeDestino != null) {
            TVertice vertOrigen = buscarVertice(nomVerticeOrigen);
            if (vertOrigen != null) {
                return vertOrigen.eliminarAdyacencia(nomVerticeDestino);
            }
        }
        return false;
    }

    private TVertice buscarVertice(Comparable nomVerticeOrigen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarVertice'");
    }

    @Override
    public boolean eliminarVertice(Comparable nombreVertice) {
        if (nombreVertice != null) {
            vertices.remove(nombreVertice);
            return !vertices.containsKey(nombreVertice);
        }
        return false;
    }

    @Override
    public boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        TVertice vertOrigen = buscarVertice(etiquetaOrigen);
        TVertice vertDestino = buscarVertice(etiquetaDestino);
        if (vertOrigen != null && vertDestino != null) {
            return vertOrigen.buscarAdyacencia(vertDestino) != null;
        }
        return false;
    }

    @Override
    public boolean existeVertice(Comparable unaEtiqueta) {
        return vertices.containsKey(unaEtiqueta);
    }

    @Override
    public boolean insertarArista(TArista arista) {
        if (arista != null) {
            TVertice vertOrigen = buscarVertice(arista.getEtiquetaOrigen());
            TVertice vertDestino = buscarVertice(arista.getEtiquetaDestino());
            if (vertOrigen != null && vertDestino != null) {
                return vertOrigen.insertarAdyacencia(arista.getCosto(), vertDestino);
            }
        }
        return false;
    }

    @Override
    public boolean insertarVertice(TVertice vertice) {
        if (vertice != null && !vertices.containsKey(vertice.getEtiqueta())) {
            vertices.put(vertice.getEtiqueta(), vertice);
            return true;
        }
        return false;
    }

    @Override
    public Map<Comparable, TVertice> getVertices() {
        return vertices;
    }

    @Override
    public void desvisitarVertices() {
        for (TVertice vertice : vertices.values()) {
            vertice.setVisitado(false);
        }
    }

    @Override
    public Collection<Comparable> bpf() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Comparable> bpf(Comparable etiquetaOrigen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TAnillosContagio anillosDeProbablesContagiados(Comparable<?> etiquetaOrigen, int maxDistancia) {
        throw new UnsupportedOperationException("Unimplemented method 'anillosDeProbablesContagiados'");
    }
}
