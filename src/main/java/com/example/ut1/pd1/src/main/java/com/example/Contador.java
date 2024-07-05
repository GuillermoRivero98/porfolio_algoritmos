package com.example.ut1.pd1.src.main.java.com.example;

public class Contador {
    private final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContadorWhile() {
        System.out.println("Contador con While");
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void mostrarContadorDoWhile() {
        System.out.println("\nContador con Do-While");
        contador = 1;
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }

    public void mostrarContadorFor() {
        System.out.println("\nContador con For");
        for (contador = 1; contador <= MAX_CONT; contador += incremento) {
            System.out.println(contador);
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.mostrarContadorWhile();
        contador.mostrarContadorDoWhile();
        contador.mostrarContadorFor();
    }
}
