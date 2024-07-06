package com.example.ut8.parcial2020.alumnos.src;

import java.util.Collection;
import java.util.Map;

public interface IGrafoDirigido {

    boolean insertarArista(TArista arista);

    boolean eliminarArista(Comparable etiquetaOrigen, Comparable etiquetaDestino);

    boolean insertarVertice(TVertice vertice);

    boolean eliminarVertice(Comparable etiquetaVertice);

    boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino);

    boolean existeVertice(Comparable etiquetaVertice);

    Map<Comparable, TVertice> getVertices();

    void desvisitarVertices();

    Collection<Comparable> bpf();

    Collection<Comparable> bpf(Comparable etiquetaOrigen);
}
