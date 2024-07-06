package com.example.ut8.parcial2018.src;
import java.util.Collection;
import java.util.LinkedList;

public class TAristas extends LinkedList<TArista> {

    private final static String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArista buscar(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        for (TArista arista : this) {
            if (arista.getEtiquetaOrigen().equals(etiquetaOrigen) && arista.getEtiquetaDestino().equals(etiquetaDestino)) {
                return arista;
            }
        }
        return null;
    }

    public TArista buscarMin(Collection<Comparable> verticesU, Collection<Comparable> verticesV) {
        TArista aristaMinima = null;
        Double costoMinimo = Double.POSITIVE_INFINITY;

        for (Comparable u : verticesU) {
            for (Comparable v : verticesV) {
                TArista arista = buscar(u, v);
                if (arista != null && arista.getCosto() < costoMinimo) {
                    aristaMinima = arista;
                    costoMinimo = arista.getCosto();
                }
            }
        }
        return aristaMinima;
    }

    public String imprimirEtiquetas() {
        StringBuilder salida = new StringBuilder();
        for (TArista arista : this) {
            salida.append(arista.getEtiquetaOrigen()).append(SEPARADOR_ELEMENTOS_IMPRESOS)
                  .append(arista.getEtiquetaDestino()).append(SEPARADOR_ELEMENTOS_IMPRESOS)
                  .append(arista.getCosto()).append("\n");
        }
        return salida.toString();
    }

    void insertarAmbosSentidos(Collection<TArista> aristas) {
        for (TArista arista : aristas) {
            this.add(arista);
            this.add(arista.aristaInversa());
        }
    }
}
