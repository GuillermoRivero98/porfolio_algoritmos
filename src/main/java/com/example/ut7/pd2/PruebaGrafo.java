package com.example.ut7.pd2;

public class PruebaGrafo {

    public static void main(String[] args) {
        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_1.txt", "./src/conexiones_1.txt",
                false, TGrafoDirigido.class);

        Object[] etiquetasarray = gd.getVertices().keySet().toArray();

        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
        Double[][] mfloyd = gd.floyd();
        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
        for (Object etiqueta : etiquetasarray) {
            System.out.println("Excentricidad de " + etiqueta + " : " + gd.obtenerExcentricidad((Comparable) etiqueta));
        }
        System.out.println();
        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
    }
}