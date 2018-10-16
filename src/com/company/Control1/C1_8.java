/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @title Crea un programa en el cual te pida un número del 1 al 999 y te devuelva el valor de sus unidades, decenas y centenas.
 *
*/
package com.company.Control1;
import java.util.Scanner;
public class C1_8 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 999");
        String nuemro = entrada.next();

        char unidades = nuemro.charAt(2);
        char decenas = nuemro.charAt(1);
        char centenas = nuemro.charAt(0);

        System.out.println("La despomposicion del nuemro "+nuemro+" es: "+centenas+" centenas, "+decenas+" decenas, "+unidades+" unidades.");
    }
}
