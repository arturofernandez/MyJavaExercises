/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description
 *  Escribe un programa en Java que solicite una palabra y muestre por pantalla el primer y ´ultimo carácter de la
 *  misma.
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex8 {
    public static void main(String [] args){
        System.out.println("Introduce una palabra:");
        Scanner entrada = new Scanner(System.in);

        String palabra = entrada.nextLine();

        System.out.println("El primer y el ultimo caracter de la palabra "+palabra+" son "+(palabra.charAt(0))+","+(palabra.charAt(palabra.length()-1))+" respectivamente.");
    }
}
