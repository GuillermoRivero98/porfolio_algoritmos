package com.example.ut8.parcial2019.src;

import java.util.Collection;
import java.util.LinkedList;

public class Programa {

    public static void main(String[] args) {
        // Crear el grafo de aerolínea con aeropuertos y vuelos
        Collection<TVertice> vertices = new LinkedList<>();
        Collection<TArista> aristas = new LinkedList<>();

        // Aquí debes inicializar y cargar los vértices y aristas del grafo
        // Ejemplo de inicialización (sustituir con datos reales):
        vertices.add(new TVertice("A"));
        vertices.add(new TVertice("B"));
        vertices.add(new TVertice("C"));

        aristas.add(new TArista("A", "B", 1.0)); // Ejemplo de arista entre A y B con costo 1.0
        aristas.add(new TArista("B", "C", 2.0)); // Ejemplo de arista entre B y C con costo 2.0

        TGrafoAerolinea aerolinea = new TGrafoAerolinea(vertices, aristas);

        String elOrigen = "A";
        String elDestino = "C";

        // Obtener el itinerario con menos escalas entre elOrigen y elDestino
        LinkedList<TVertice> lasEscalas = aerolinea.menosEscalas(elOrigen, elDestino);

        // Mostrar las escalas y listar en archivo de salida (simulado con System.out)
        System.out.println("Itinerario mejor para vuelo entre " + elOrigen + " y " + elDestino + ": ");
        if (lasEscalas != null) {
            for (TVertice v : lasEscalas) {
                System.out.println(v.getEtiqueta());
            }
        } else {
            System.out.println("No se encontró un itinerario válido.");
        }
    }
}
