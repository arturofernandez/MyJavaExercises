/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que solicite dos palabras y muestre true si comienzan por el mismo carácter (sin
 * tener en cuenta may´usculas y minúsculas), o false en caso contrario.
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex12 {
    public static void main(String [] args){
        System.out.println("Introduce a word:");
        Scanner input = new Scanner (System.in);

        String word = input.nextLine();
        String lastLetter =  word.substring((word.length())-1);
        String firtsLetter =  word.substring(0,1);

        System.out.println("The word "+word+" starts and ends with the same letter?"+firtsLetter+lastLetter);
        System.out.println(lastLetter.equalsIgnoreCase(firtsLetter));
    }

}
