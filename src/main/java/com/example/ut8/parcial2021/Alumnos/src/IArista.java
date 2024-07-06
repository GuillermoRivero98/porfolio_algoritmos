package com.example.ut8.parcial2021.Alumnos.src;

public interface IArista {
    double getCosto();
    Comparable getEtiquetaDestino();
    Comparable getEtiquetaOrigen();
    void setCosto(double costo);
    void setEtiquetaDestino(Comparable etiquetaDestino);
    void setEtiquetaOrigen(Comparable etiquetaOrigen);
}
