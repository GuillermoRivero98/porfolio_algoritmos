package com.example.ut8.parcial2018.src;

import java.util.Collection;
import java.util.LinkedList;

public class Programa {

    public static void main(String[] args) {

        // Cargar grafo con actores y relaciones (debes implementar esto según tu necesidad)

        LinkedList<TVertice> losActores = new LinkedList<>();
        TAristas lasPeliculas = new TAristas();
        TGrafoNoDirigido gkb = new TGrafoNoDirigido(losActores, lasPeliculas);

        // Ejemplo de cómo listar contactos de un actor con máximo 1 salto
        String actorZZ1 = ""; // Actor a consultar, debe ser especificado
        Collection<TVertice> contactos1 = gkb.listarContactos(actorZZ1, 1);
        // Escribir los resultados al archivo "salida.txt"

        // Ejemplo de cómo listar contactos de otro actor con máximo 2 saltos
        String actorZZ2 = ""; // Otro actor a consultar, debe ser especificado
        Collection<TVertice> contactos2 = gkb.listarContactos(actorZZ2, 2);
        // Escribir los resultados al archivo "salida.txt"
    }
}
