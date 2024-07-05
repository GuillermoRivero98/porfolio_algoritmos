package com.example.ut7.pd7;

public class TAdyacencia {

    private Double costo;
    private TVertice destino;

    public TAdyacencia(Double costo, TVertice destino) {
        this.costo = costo;
        this.destino = destino;
    }

    public Double getCosto() {
        return costo;
    }

    public TVertice getDestino() {
        return destino;
    }
}

