package com.example.ut8.parcial2020.alumnos.src;

import java.util.ArrayList;
import java.util.List;

public class TAnillosContagio {

    private List<TVertice> contagioVertices;
    private List<TVertice> contagioVerticesOrigen;

    public TAnillosContagio() {
        contagioVertices = new ArrayList<>();
        contagioVerticesOrigen = new ArrayList<>();
    }

    public void agregarVertice(TVertice vertice, TVertice origen) {
        contagioVertices.add(vertice);
        contagioVerticesOrigen.add(origen);
    }

    public void generarArchivoAnillos(String string, int distMaxParaArchivoListado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarArchivoAnillos'");
    }

    public String cantidadDeContactosEnAnillo(int distAnilloBuscar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantidadDeContactosEnAnillo'");
    }

}
