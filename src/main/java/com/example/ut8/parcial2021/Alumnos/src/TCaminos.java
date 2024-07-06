package com.example.ut8.parcial2021.Alumnos.src;

import java.util.Collection;
import java.util.LinkedList;


public class TCaminos {
    
    private Collection<TCamino> caminos;

    public TCaminos() {
        this.caminos = new LinkedList<>();
    }
    
    public String imprimirCaminos(){
        StringBuilder sb = new StringBuilder();
        for (TCamino camino : caminos){
            sb.append(camino.imprimirEtiquetas()+"\n");
        }
        return sb.toString();
    }

    public void imprimirCaminosConsola(){
        System.out.println(imprimirCaminos());
    }

    public Collection<TCamino> getCaminos() {
        return caminos;
    }

    int costoMin() {
        
        int costoMenor = Integer.MAX_VALUE;
        int tempCosto;
        for (TCamino elcamino:caminos){
            tempCosto =elcamino.getOtrosVertices().size();
            if ( tempCosto < costoMenor) costoMenor = tempCosto;
        }
        return costoMenor;
    }
    
    
    
}
