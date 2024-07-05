package com.example.ut1.pd4.src.main.java.com.example;

public class ContenedorDeNumeros {
    public static void main(String[] args) {
        NumberHolder holder = new NumberHolder();

        holder.anInt = 10;
        holder.aFloat = 3.14f;

        System.out.println("El valor del entero es " + holder.anInt);
        System.out.println("El valor del flotante es " + holder.aFloat);
    }
}

class NumberHolder {
    public int anInt;
    public float aFloat;
}
