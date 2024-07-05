package com.example.ut1.ut1_pd9.src.main.java.com.example;

public class FactorialCalculator {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Factorial de " + numero + " es: " + factorial(numero));
        try {
            int factorialNegativo = factorial(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
