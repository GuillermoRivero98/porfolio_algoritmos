package com.example.ut8.parcial2021.Alumnos.src;

import java.util.Collection;
import java.util.LinkedList;

public class TAristas extends LinkedList<TArista> {

    private final static String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public String imprimirEtiquetas() {
        if (this.isEmpty()) {
            return null;
        }
        StringBuilder salida = new StringBuilder();
        for (TArista arista : this) {
            salida.append(arista.getEtiquetaOrigen()).append(SEPARADOR_ELEMENTOS_IMPRESOS)
                  .append(arista.getEtiquetaDestino()).append(SEPARADOR_ELEMENTOS_IMPRESOS)
                  .append(arista.getCosto()).append("\n");
        }
        return salida.toString();
    }

    void insertarAmbosSentidos(Collection<TArista> aristas) {
        for (TArista ta : aristas) {
            this.add(ta);
            this.add(ta.aristaInversa());
        }
    }

    public boolean insertarArista(TArista arista) {
        if (this.add(arista)) {
            TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
            return this.add(arInv);
        }
        return false;
    }
}