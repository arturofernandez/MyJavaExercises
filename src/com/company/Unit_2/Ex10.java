/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que solicite una palabra y muestre true si su primer y ´ultimo caracter son iguales,
 * o false en caso contrario.
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex10 {
    public static void main (String [] args){
        System.out.println("Introduce a word");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println("Are the first and the second characters of "+word+" the same?");
        System.out.println(word.charAt(word.length()-1) == word.charAt(0));
    }
}
