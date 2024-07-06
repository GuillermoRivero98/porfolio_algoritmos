package com.example.ut8.parcial2020.alumnos.src;

public class Parcial2 {

    public static void main(String[] args) {
        
        // CREAR EL GRAFO CON PERSONAS.TXT y CONTACTOS.TXT
        TGrafoContagios grafoTrazabilidad = (TGrafoContagios) UtilGrafos.cargarGrafo(
                "src/personas.txt",
                "src/contactos.txt",
                false, TGrafoContagios.class);

        // Estos valores se deberán obtener del pizarrón
        String personaCOVID = "nombre_de_persona"; // SE INDICARA EN EL PIZARRON
        int maxDistancia = 3; // SE INDICARA EN EL PIZARRON
        
        // invocar al método "anillosDeProbablesContagiados" con estos parámetros
        TAnillosContagio anillos = grafoTrazabilidad.anillosDeProbablesContagiados(personaCOVID, maxDistancia);
        
        // Emitir por consola la cantidad de contactos que se encuentran a la distancia de la personaCOVID indicada
        int distAnilloBuscar = 2; // SE INDICARA EN EL PIZARRON
        System.out.println("Cantidad de contactos a distancia " + distAnilloBuscar + ": " + anillos.cantidadDeContactosEnAnillo(distAnilloBuscar));
        
        // Emitir el archivo "ANILLOS.TXT"
        int distMaxParaArchivoListado = 3; // SE INDICARÁ EN EL PIZARRÓN
        anillos.generarArchivoAnillos("anillos.txt", distMaxParaArchivoListado);
    }
}
