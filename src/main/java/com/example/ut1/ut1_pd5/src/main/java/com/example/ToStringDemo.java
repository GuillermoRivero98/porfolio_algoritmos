package com.example.ut1.ut1_pd5.src.main.java.com.example;

public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits before decimal point.");
        System.out.println((s.length() - dot - 1) + " digits after decimal point.");
    }
}

/*
 * dot contiene la posición del punto decimal en la cadena, que es 3.
 * s.length() - dot - 1 calcula la cantidad de dígitos después del punto decimal
 * (5 - 3 - 1 = 2).
 * 
 * salida:
 * 3 digits before decimal point.
 * 2 digits after decimal point.
 * 
 * La primera línea imprime la cantidad de dígitos antes del punto
 * decimal, mientras que la segunda línea imprime la cantidad de dígitos después
 * del punto decimal. Esto se logra mediante el uso del método Double.toString()
 * para convertir el número 888.51 en una cadena, encontrar la posición del
 * punto decimal usando indexOf('.'), y luego calcular las longitudes
 * correspondientes.
 */