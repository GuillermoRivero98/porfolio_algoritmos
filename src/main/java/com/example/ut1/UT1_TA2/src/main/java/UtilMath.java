package com.example.ut1.UT1_TA2.src.main.java;

public class UtilMath {

    // Método para calcular el factorial de un número utilizando bucles for
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
