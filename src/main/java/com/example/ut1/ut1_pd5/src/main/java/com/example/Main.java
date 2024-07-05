package com.example.ut1.ut1_pd5.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color);
        }
    }

    public enum Color {
        RED, GREEN, BLUE;
    }
}

/*
 * Esta clase enumera y muestra en consola los valores del enum Color.
 */