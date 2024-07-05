package com.example.ut1.UT1_TA2.src.main.java;

public class NumerosPrimos {

    // Método para verificar si un número es primo y calcular la suma de pares o impares
    public static long calcularSumaSegunPrimo(long n) {
        long suma = 0;

        if (isPrime(n)) {
            long i = 0;
            while (i <= n) {
                if (i % 2 == 0) {
                    suma += i;
                }
                i++;
            }
        } else {
            long i = 0;
            while (i <= n) {
                if (i % 2 != 0) {
                    suma += i;
                }
                i++;
            }
        }
        return suma;
    }

    public static boolean isPrime(long n) {
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
