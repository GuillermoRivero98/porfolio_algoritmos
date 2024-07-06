package com.example.ut8.parcial2021.Alumnos.src;

import java.util.Collection;
import java.util.Map;

public interface IGrafoDirigido {
    boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino);
    boolean eliminarVertice(Comparable nombreVertice);
    boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino);
    boolean existeVertice(Comparable unaEtiqueta);
    boolean insertarArista(TArista arista);
    boolean insertarVertice(TVertice vertice);
    Collection<Comparable> bpf();
    Collection<Comparable> bpf(TVertice vertice);
    Collection<Comparable> bpf(Comparable etiquetaOrigen);
    Map<Comparable, TVertice> getVertices();
    void desvisitarVertices();
    TCaminos todosLosCaminos(Comparable etiquetaOrigen, Comparable etiquetaDestino);
    boolean tieneCiclo();
}
