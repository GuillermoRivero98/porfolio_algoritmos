package com.example.ut1.pd1.src.main.java.com.example;

public class Alumno {
    private String nombre;
    public Alumno(){
        nombre= null;
    }
    public String getNombreAdmiracion(){
        return nombre.concat("!");
    }
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
    }
}

