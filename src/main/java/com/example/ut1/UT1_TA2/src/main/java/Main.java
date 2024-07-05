package com.example.ut1.UT1_TA2.src.main.java;

public class Main {

    public static void main(String[] args) {
        // Ejercicio #1: Calcular factorial de 5
        int numeroFactorial = 5;
        System.out.println("Factorial de " + numeroFactorial + " es: " + UtilMath.factorial(numeroFactorial));

        // Ejercicio #2: Verificar si 17 es primo y calcular la suma según sea primo o no
        long numeroPrimo = 17;
        long sumaSegunPrimo = NumerosPrimos.calcularSumaSegunPrimo(numeroPrimo);
        if (NumerosPrimos.isPrime(numeroPrimo)) {
            System.out.println(numeroPrimo + " es primo. Suma de números pares hasta " + numeroPrimo + ": " + sumaSegunPrimo);
        } else {
            System.out.println(numeroPrimo + " no es primo. Suma de números impares hasta " + numeroPrimo + ": " + sumaSegunPrimo);
        }
    }
}
