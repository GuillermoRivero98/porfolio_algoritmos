package com.example.ut1.ut1_pd8.src.main.java.com.example;

public class Marcapasos {
    // Variables de la clase
    private short presionSanguinea; // 2 bytes
    private byte frecuenciaCardiaca; // 1 byte
    private short nivelAzucarSangre; // 2 bytes
    private long maxFuerzaExpuesto; // 8 bytes
    private float minTiempoLatidos; // 4 bytes
    private double bateriaRestante; // 8 bytes
    private String codigoFabricante; // 16 bytes (UTF-16, sin contar sobrecarga del objeto)

    // Constructor
    public Marcapasos(short presionSanguinea, byte frecuenciaCardiaca, short nivelAzucarSangre,
                      long maxFuerzaExpuesto, float minTiempoLatidos, double bateriaRestante,
                      String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucarSangre = nivelAzucarSangre;
        this.maxFuerzaExpuesto = maxFuerzaExpuesto;
        this.minTiempoLatidos = minTiempoLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }

    // Método para calcular la memoria ocupada por el objeto
    public long calcularMemoriaConsumida() {
        // Calcular la memoria consumida por las variables primitivas
        long memoriaConsumida = 2 + 1 + 2 + 8 + 4 + 8 + 16; // sumando el tamaño de cada tipo de dato

        // La sobrecarga de un objeto String puede variar, pero aquí asumimos solo los caracteres

        return memoriaConsumida;
    }

    public static void main(String[] args) {
        Marcapasos marcapasos = new Marcapasos((short) 120, (byte) 75, (short) 95, 1500000000L, 0.85f, 99.5, "ABC1234");
        System.out.println("Memoria consumida por el objeto Marcapasos: " + marcapasos.calcularMemoriaConsumida() + " bytes");
    }
}
