package com.example.ut1.ut1_pd6.src.main.java.com.example;
import java.util.Scanner;

public class LectorCirculo {
    public static void leerCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        scanner.close();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }
}

