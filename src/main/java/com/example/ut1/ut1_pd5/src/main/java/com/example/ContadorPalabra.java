package com.example.ut1.ut1_pd5.src.main.java.com.example;

public class ContadorPalabra {

    public enum LetterType {
        VOWEL, CONSONANT;
    }

    public int cantidadPalabras(String frase) {
        int finDeLinea = frase.length() - 1;
        int contador = 0;
        boolean esPalabra = false;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i)) && i != finDeLinea) {
                esPalabra = true;
            } else if ((frase.charAt(i) == ' ' || i == finDeLinea) && esPalabra) {
                contador++;
                esPalabra = false;
            }
        }
        return contador;
    }

    public void agruparLetras(String frase) {
        String fraseMin = frase.toLowerCase();
        int contVocales = 0;
        int contConsonantes = 0;
        for (int i = 0; i < fraseMin.length(); i++) {
            char letra = fraseMin.charAt(i);
            if (Character.isLetter(letra)) {
                LetterType tipo = determinarTipoLetra(letra);
                if (tipo == LetterType.VOWEL) {
                    contVocales++;
                } else if (tipo == LetterType.CONSONANT) {
                    contConsonantes++;
                }
            }
        }
        System.out.println("El número de vocales en la frase es: " + contVocales);
        System.out.println("El número de consonantes en la frase es: " + contConsonantes);
    }

    private LetterType determinarTipoLetra(char letra) {
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return LetterType.VOWEL;
            default:
                return LetterType.CONSONANT;
        }
    }
}

/*
 * Cantidad de Palabras: Se cuenta correctamente el número de palabras en una
 * frase, considerando espacios y caracteres finales.
 * 
 * Agrupar Letras: Se cuenta el número de vocales y consonantes en una frase
 * dada.
 * 
 * Utiliza métodos como Character.isLetter() y un enum LetterType
 * para distinguir entre vocales y consonantes. Además, el método
 * cantidadPalabras cuenta palabras correctamente utilizando condiciones y
 * bucles.
 */