/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que reciba dos String y devuelva el más corto. Si tienen la misma longitud, debe devolver el primer String.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cadena de texto numero 1");
        String cadena1 = entrada.nextLine();
        System.out.println("Introduce la cadena de texto numero 2");
        String cadena2 = entrada.nextLine();

        System.out.println("La cadena mas corta de las dos introducidas es: " + cadenaCorta(cadena1,cadena2));
    }
    public static String cadenaCorta (String cad1, String cad2){
        String cadMasCorta = "";

        if (cad1.length() > cad2.length()){
            cadMasCorta = cad2;
        }else {
            cadMasCorta = cad1;
        }
        return cadMasCorta;
    }
}
