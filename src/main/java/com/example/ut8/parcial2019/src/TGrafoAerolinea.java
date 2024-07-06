package com.example.ut8.parcial2019.src;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TGrafoAerolinea extends TGrafoDirigido implements IGrafoAerolinea {

    public TGrafoAerolinea(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public LinkedList<TVertice> menosEscalas(Comparable origen, Comparable destino) {
        TVertice inicio = this.buscarVertice(origen);
        TVertice fin = this.buscarVertice(destino);

        if (inicio == null || fin == null) {
            return null; // Manejar el caso en que no se encuentren los vértices
        }

        LinkedList<TVertice> recorrido = new LinkedList<>();
        LinkedList<TVertice> cola = new LinkedList<>();
        Map<TVertice, TVertice> predecesores = new HashMap<>();

        inicio.setVisitado(true);
        cola.add(inicio);

        while (!cola.isEmpty()) {
            TVertice actual = cola.poll();

            if (actual.equals(fin)) {
                // Reconstruir el camino desde el inicio hasta el fin
                TVertice v = fin;
                while (v != null) {
                    recorrido.addFirst(v);
                    v = predecesores.get(v);
                }
                return recorrido;
            }

            for (TAdyacencia ady : (Collection<TAdyacencia>) actual.getAdyacentes()) {
                TVertice vecino = ady.getDestino();
                if (!vecino.getVisitado()) {
                    vecino.setVisitado(true);
                    predecesores.put(vecino, actual);
                    cola.add(vecino);
                }
            }
        }

        return null; // En caso de que no haya camino posible
    }
}
