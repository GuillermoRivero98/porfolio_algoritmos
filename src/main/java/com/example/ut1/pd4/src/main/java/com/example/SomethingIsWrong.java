package com.example.ut1.pd4.src.main.java.com.example;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("El área de mi rectángulo es " + myRect.width * myRect.height);
    }
}

//myRect no está inicializado antes de ser usado.