package com.example.ut1.ut1_pd6.src.main.java.com.example;

public class MultiplicacionVectores {

    public static void main(String[] args) {
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {4.0, 5.0, 6.0};
        if (puedenMultiplicarse(vector1, vector2)) {
            double resultado = multiplicarVectores(vector1, vector2);
            System.out.println("El resultado de la multiplicación de vectores es: " + resultado);
        } else {
            System.out.println("Los vectores no pueden ser multiplicados. Asegúrate de que tengan la misma dimensión.");
        }
    }

    public static boolean puedenMultiplicarse(double[] vector1, double[] vector2) {
        return vector1.length == vector2.length;
    }

    public static double multiplicarVectores(double[] vector1, double[] vector2) {
        double productoEscalar = 0.0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}

