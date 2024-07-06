package com.example.ut8.parcial2021.Alumnos.src;

import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Programa {

    public static void main(String[] args) {
        TGrafoRedDatos redDatos = new TGrafoRedDatos(null, null);
        
        String servidor1 = "BUF";
        String[] destinos = { "DFW", "LAS", "MIA" };

        try (PrintWriter writer = new PrintWriter(new FileWriter("rutas.txt"))) {
            for (String servidor2 : destinos) {
                LinkedList<TVertice> ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
                writer.println("Ruta de " + servidor1 + " a " + servidor2 + ":");
                for (TVertice vertice : ruta) {
                    writer.print(vertice.getEtiqueta() + " ");
                }
                writer.println();
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
