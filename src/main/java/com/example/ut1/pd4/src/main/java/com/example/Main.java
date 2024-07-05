package com.example.ut1.pd4.src.main.java.com.example;

import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle myRect= new Rectangle();
        myRect.width = 40;
        myRect.height = 50;

        System.out.println("el area de mi rectangulo es " + myRect.width * myRect.height);
    }
}