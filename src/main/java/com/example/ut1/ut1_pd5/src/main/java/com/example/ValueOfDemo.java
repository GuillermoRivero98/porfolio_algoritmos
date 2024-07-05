package com.example.ut1.ut1_pd5.src.main.java.com.example;

public class ValueOfDemo {
    public static void main(String[] args) {
        if (args.length == 2) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Este programa " +
                    "requiere dos argumentos en la línea de comandos.");
        }
    }
}
/*
 * Este programa realiza operaciones aritméticas simples (+, -, *,
 * /, %) con dos números de tipo float, leídos desde la línea de comandos. La
 * salida dependerá de los argumentos proporcionados al programa.
 */