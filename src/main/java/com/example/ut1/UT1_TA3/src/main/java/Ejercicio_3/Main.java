package com.example.ut1.UT1_TA3.src.main.java.Ejercicio_3;

public class Main {

    public static void main(String[] args) {
        Marcapasos marcapasos = new Marcapasos();

        marcapasos.setPresionSanguinea(120);
        marcapasos.setFrecuenciaCardiaca(80);
        marcapasos.setNivelAzucar(150);
        marcapasos.setMaxFuerzaExpuesta(1500000000L);
        marcapasos.setMinTiempoEntreLatidos(0.05f);
        marcapasos.setBateriaRestante(75.5f);
        marcapasos.setCodigoFabricante("ABC12345");

        long size = 4 * 3 + 8 + 4 + (16 + 8); 
        System.out.println("Tamaño en memoria del objeto Marcapasos: " + size + " bytes");
    }
}
