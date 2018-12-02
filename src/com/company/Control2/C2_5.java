/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: escribe un metodo estatico que pida un String y le de la vuelta.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto");
        String cad = entrada.nextLine();
        System.out.println("La cadena del revés es: "+cadenaDelReves(cad));
    }

    public static String cadenaDelReves (String cad){
        String delReves = "";

        for (int i = cad.length()-1; i>=0;i--){
            delReves += cad.substring(i,i+1);
        }
        System.out.println(delReves);
        return delReves;

    }
}
