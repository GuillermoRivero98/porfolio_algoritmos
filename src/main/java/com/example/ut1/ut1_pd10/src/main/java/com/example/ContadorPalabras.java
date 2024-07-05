package com.example.ut1.ut1_pd10.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContadorPalabras {
    
    public static String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        List<String> palabrasComunes = new ArrayList<>();
        
        for (String palabra1 : palabras1) {
            for (String palabra2 : palabras2) {
                if (palabra1.equals(palabra2)) {
                    if (!palabrasComunes.contains(palabra1)) {
                        palabrasComunes.add(palabra1);
                    }
                }
            }
        }
        return palabrasComunes.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
        String[] Ar1 = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] Ar2 = {"Hola", "mundo", "de", "la", "informática"};
        
        String[] resultado = palabrasComunes(Ar1, Ar2);
        
        System.out.println("Palabras comunes: " + Arrays.toString(resultado));
    }
}
