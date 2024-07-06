package com.example.ut8.parcial2021.Alumnos.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ManejadorArchivosGenerico {

    public static void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        try (FileWriter fw = new FileWriter(nombreCompletoArchivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (String linea : listaLineasArchivo) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public static String[] leerArchivoRutaRelativa(String nombreCompletoArchivo, boolean ignoreHeader) {
        String path = ManejadorArchivosGenerico.class.getResource(nombreCompletoArchivo).getPath();
        return leerArchivo(path, ignoreHeader);
    }

    public static String[] leerArchivo(String nombreCompletoArchivo, boolean ignoreHeader) {
        ArrayList<String> listaLineasArchivo = new ArrayList<>();
        try (FileReader fr = new FileReader(nombreCompletoArchivo);
             BufferedReader br = new BufferedReader(fr)) {
            String lineaActual;
            if (ignoreHeader) br.readLine();
            while ((lineaActual = br.readLine()) != null) {
                listaLineasArchivo.add(lineaActual);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
        return listaLineasArchivo.toArray(new String[0]);
    }
}
