package com.example.ut1.ut1_pd9.src.main.java.com.example;

public class PrimoSuma {
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if ((n % 2 != 0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        long numero = 17;
        long suma = 0;

        if (isPrime(numero)) {
            long i = 0;
            while (i <= numero) {
                if (i % 2 == 0) {
                    suma += i;
                }
                i++;
            }
            System.out.println("El número " + numero + " es primo.");
            System.out.println("La suma de los números pares hasta " + numero + " es: " + suma);
        } else {
            long i = 0;
            while (i <= numero) {
                if (i % 2 != 0) {
                    suma += i;
                }
                i++;
            }
            System.out.println("El número " + numero + " no es primo.");
            System.out.println("La suma de los números impares hasta " + numero + " es: " + suma);
        }
    }
}

