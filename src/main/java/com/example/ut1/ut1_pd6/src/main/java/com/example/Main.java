package com.example.ut1.ut1_pd6.src.main.java.com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Imprimir tablero
        int n = 7;
        imprimirTablero(n, n);
        
        // Ejercicio 2: Leer circunferencia
        leerCirculo();
        
        // Ejercicio 3: Transformar texto a T9
        String rutaArchivoEntrada ="C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut1\\ut1_pd6\\src\\main\\java\\com\\example\\entrada.txt";
        String rutaArchivoSalida ="C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut1\\ut1_pd6\\src\\main\\java\\com\\example\\salida.txt";
        
        transformarTextoT9(rutaArchivoEntrada, rutaArchivoSalida);
        
        // Ejercicio 4: Multiplicación de vectores
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {4.0, 5.0, 6.0};
        multiplicarVectores(vector1, vector2);
    }

    // Ejercicio 1: Imprimir tablero
    public static void imprimirTablero(int largo, int ancho) {
        Tablero.imprimirTablero(largo, ancho);
    }

    // Ejercicio 2: Leer circunferencia
    public static void leerCirculo() {
        LectorCirculo.leerCirculo();
    }

    // Ejercicio 3: Transformar texto a T9
    public static void transformarTextoT9(String rutaArchivoEntrada, String rutaArchivoSalida) {
        TransformarTextoT9.transformarTextoT9(rutaArchivoEntrada, rutaArchivoSalida);
    }

    // Ejercicio 4: Multiplicación de vectores
    public static void multiplicarVectores(double[] vector1, double[] vector2) {
        if (MultiplicacionVectores.puedenMultiplicarse(vector1, vector2)) {
            double resultado = MultiplicacionVectores.multiplicarVectores(vector1, vector2);
            System.out.println("El resultado de la multiplicación de vectores es: " + resultado);
        } else {
            System.out.println("Los vectores no pueden ser multiplicados. Asegúrate de que tengan la misma dimensión.");
        }
    }
}
