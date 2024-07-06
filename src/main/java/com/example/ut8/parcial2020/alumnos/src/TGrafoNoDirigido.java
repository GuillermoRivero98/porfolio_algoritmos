package com.example.ut8.parcial2020.alumnos.src;

import java.util.Collection;

public class TGrafoNoDirigido extends TGrafoDirigido {

    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public TAnillosContagio anillosDeProbablesContagiados(Comparable etiquetaOrigen, int maxDistancia) {
        return super.anillosDeProbablesContagiados(etiquetaOrigen, maxDistancia);
    }
}
