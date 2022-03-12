/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaconexionGithub;

import java.util.Scanner;

/**
 *
 * @author David Fernandez Gomez
 */
public class Github {

/**
 *
 * @author David Fernandez Gomez
 */
public class PracticaconexionGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //indicamos las variables
            Scanner num = new Scanner(System.in);
            String frase = null;
            int longitud;
            int i, j, contador = 1;
            //bucle impide que este vacia o en blanco
            do {
                System.out.println("introduce la cadena de caracteres: ");
                frase = num.nextLine();
            } while (frase.trim().isBlank() || frase.isEmpty());
            longitud = frase.length();
            for (j = 0; j < longitud; j++) {
                if (frase.charAt(j) == ' ') {
                    contador++;
                }
            }
            System.out.println("la cadena se compone de " + contador + " palabras que son las siguientes: ");
            for (i = 0; i < longitud; i++) {
                System.out.print(frase.charAt(i));
                if (Character.isWhitespace(frase.charAt(i))) {
                    System.out.println("");
                }
            }
            System.out.println("");
        }
    }
}
    
