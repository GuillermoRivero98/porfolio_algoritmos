package com.example.ut1.pd1.src.main.java.com.example;

public class Utils {
    public static int recorrer(String cadena) { 
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {  // Error: Índice debe empezar en 0
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 7;  // Error: El índice original estaba fuera de los límites del array
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        return palabra.charAt(0);  // Error: Asegurarse de que la palabra no esté vacía
    }

    public static String paraAString(int a) {
        return Integer.toString(a);  // Error: Conversión incorrecta de int a String
    }
}

/* Correcciones:
 * recorrer: El índice del bucle for debe empezar en 0. Este error se detectó cuando el programa lanzó una 
 * excepción al intentar acceder a un índice no válido.
 * getValor: El índice original utilizado estaba fuera de los límites del array (8 en lugar de 7). Este error 
 * se detectó al recibir una ArrayIndexOutOfBoundsException durante la ejecución.
 * getPrimerCaracter: Se intentaba acceder al primer carácter de una cadena que podía estar vacía. 
 * Este error se detectó al lanzar una StringIndexOutOfBoundsException.
 * paraAString: La conversión incorrecta de int a String lanzó una ClassCastException. 
 * La solución fue usar Integer.toString(a) en lugar de un casting incorrecto.
 */
