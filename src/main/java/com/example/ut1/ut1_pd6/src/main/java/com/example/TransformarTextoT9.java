package com.example.ut1.ut1_pd6.src.main.java.com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransformarTextoT9 {
    public static void transformarTextoT9(String rutaArchivoEntrada, String rutaArchivoSalida) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivoSalida))) {

            Map<Character, String> mapaT9 = new HashMap<>();
            mapaT9.put('a', "2"); mapaT9.put('b', "2"); mapaT9.put('c', "2");
            mapaT9.put('d', "3"); mapaT9.put('e', "3"); mapaT9.put('f', "3");
            mapaT9.put('g', "4"); mapaT9.put('h', "4"); mapaT9.put('i', "4");
            mapaT9.put('j', "5"); mapaT9.put('k', "5"); mapaT9.put('l', "5");
            mapaT9.put('m', "6"); mapaT9.put('n', "6"); mapaT9.put('o', "6");
            mapaT9.put('p', "7"); mapaT9.put('q', "7"); mapaT9.put('r', "7"); mapaT9.put('s', "7");
            mapaT9.put('t', "8"); mapaT9.put('u', "8"); mapaT9.put('v', "8");
            mapaT9.put('w', "9"); mapaT9.put('x', "9"); mapaT9.put('y', "9"); mapaT9.put('z', "9");
            mapaT9.put(' ', "0"); mapaT9.put('.', "1");

            String linea;
            while ((linea = lector.readLine()) != null) {
                for (char caracter : linea.toLowerCase().toCharArray()) {
                    escritor.write(mapaT9.get(caracter));
                }
                escritor.newLine();
            }
            System.out.println("Texto transformado a T9 y guardado en " + rutaArchivoSalida);
        } catch (IOException e) {
            System.err.println("Error al leer/escribir el archivo: " + e.getMessage());
        }
    }
}
