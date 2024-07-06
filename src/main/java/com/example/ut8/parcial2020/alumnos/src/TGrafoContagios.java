package com.example.ut8.parcial2020.alumnos.src;

import java.util.Collection;

public class TGrafoContagios extends TGrafoNoDirigido implements IGrafoContagio {

    public TGrafoContagios(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public TAnillosContagio anillosDeProbablesContagiados(String personaCOVID, int maxDistancia) {
        return super.anillosDeProbablesContagiados(personaCOVID, maxDistancia);
    }

}
