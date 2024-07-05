package com.example.ut1.ut1_pd5.src.main.java.com.example;

public class ComputeResult {
    public static void main(String[] args) {
        String original = "este es el curso de Programación 2";
        StringBuilder result = new StringBuilder("hola");
        int index = original.indexOf('a');
        /* 1 */ result.setCharAt(0, original.charAt(0));
        /* 2 */ result.setCharAt(1, original.charAt(original.length() - 1));
        /* 3 */ result.insert(1, original.charAt(4));
        /* 4 */ result.append(original.substring(1, 4));
        /* 5 */ result.insert(3, (original.substring(index, index + 2) + " "));
        System.out.println(result);
    }
}
/*
 * 1)result.setCharAt(0, original.charAt(0));
 * result después de esta línea: "eola"
 * 
 * 2)result.setCharAt(1, original.charAt(original.length() - 1));
 * result después de esta línea: "e2la"
 * 
 * 3)result.insert(1, original.charAt(4));
 * result después de esta línea: "e 2la"
 * 
 * 4)result.append(original.substring(1, 4));
 * result después de esta línea: "e 2latest"
 * 
 * 5)result.insert(3, (original.substring(index, index + 2) + " "));
 * result después de esta línea: "e 2eslatest"
 * 
 * Cada línea del código realiza operaciones específicas sobre un
 * StringBuilder llamado result, modificando y concatenando caracteres y
 * subcadenas de la cadena original.
 */