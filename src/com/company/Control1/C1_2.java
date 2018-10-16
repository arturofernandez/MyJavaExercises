/*
 * @author ARTURO FERNANDEZ
 * @version 13/10/2018
 * @title Realiza un programa que pida un nombre y compruebe si contiene la letra "a".
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_2 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = entrada.next();

        System.out.println(nombre.toLowerCase().contains("a"));
    }
}
