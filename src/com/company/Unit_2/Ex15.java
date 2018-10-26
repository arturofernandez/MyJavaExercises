/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description :
 *
 * Escribe un programa en Java que solicite una frase y muestre la primera y ultima palabra de la frase. Supondremos
 * que las frases introducidas tienen al menos dos palabras y que cada una de las palabras está separada por un
 * unico espacio.
 *
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex15 {
    public static void main (String [] args){
        System.out.println("Write a phrase:");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();

        String firstWord = phrase.substring(0,phrase.indexOf(" "));
        String lastWord = phrase.substring(phrase.lastIndexOf(" ")+1);

        System.out.println("The firts word of the phrase is: "+firstWord);
        System.out.println("The last word of the phrase is: "+lastWord);

    }
}
