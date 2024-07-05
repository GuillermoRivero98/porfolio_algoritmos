package com.example.ut1.ut1_pd6.src.main.java.com.example;

public class Tablero {
    public static void main(String[] args) {
        int n = 7;
        imprimirTablero(n, n);
    }

    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}