/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que solicite una frase f y una palabra p, y muestre por pantalla true si p es un
 * prefijo de f, o false en caso contrario.
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex14 {
    public static void main(String [] args) {
        System.out.println("Introduce una frase");
        Scanner entrada = new Scanner (System.in);
        String f = entrada.nextLine();

        System.out.println("Introduce una palabra:");
        String p = entrada.nextLine();


    }
}
