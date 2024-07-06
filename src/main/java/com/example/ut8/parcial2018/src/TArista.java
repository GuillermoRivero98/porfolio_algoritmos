package com.example.ut8.parcial2018.src;

public class TArista {
    private Comparable etiquetaOrigen;
    private Comparable etiquetaDestino;
    private Double costo;

    public TArista(Comparable etiquetaOrigen, Comparable etiquetaDestino, Double costo) {
        this.etiquetaOrigen = etiquetaOrigen;
        this.etiquetaDestino = etiquetaDestino;
        this.costo = costo;
    }

    public Comparable getEtiquetaOrigen() {
        return etiquetaOrigen;
    }

    public Comparable getEtiquetaDestino() {
        return etiquetaDestino;
    }

    public Double getCosto() {
        return costo;
    }

    public TArista aristaInversa() {
        return new TArista(etiquetaDestino, etiquetaOrigen, costo);
    }
}
