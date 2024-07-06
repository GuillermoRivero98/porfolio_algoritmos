package com.example.ut8.parcial2018.src;
import java.util.Collection;
import java.util.LinkedList;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido, IGrafoKevinBacon {

    private TAristas lasAristas = new TAristas();

    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
        lasAristas.insertarAmbosSentidos(aristas);
    }

    @Override
    public boolean insertarArista(TArista arista) {
        TArista aristaInversa = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        return super.insertarArista(arista) && super.insertarArista(aristaInversa);
    }

    public TAristas getLasAristas() {
        return lasAristas;
    }

    @Override
    public TGrafoNoDirigido Prim() {
        // Implementación del algoritmo de Prim para obtener un MST (Minimum Spanning Tree)
        return null;
    }

    @Override
    public TGrafoNoDirigido Kruskal() {
        // Implementación del algoritmo de Kruskal para obtener un MST (Minimum Spanning Tree)
        return null;
    }

    @Override
    public Collection<TVertice> listarContactos(String nombreActor, int maxSaltos) {
        // Implementación para listar los contactos de un actor hasta ciertos saltos
        LinkedList<TVertice> visitados = new LinkedList<>();
        TVertice actorInicial = buscarVertice(nombreActor);
        if (actorInicial != null) {
            actorInicial.listarContactos(visitados, maxSaltos);
        }
        return visitados;
    }
}
