/*
 * @author ARTURO FERNANDEZ
 * @version 22/10/2018
 *
 */
package com.company.Exam.Exam2018;

import java.util.Scanner;

public class MyExEj3 {
    public static void main(String[] args) {
        String PrimeraPal;
        String ultPal;
        int intentos = 0;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce una frase encadenable");
            String cadena = entrada.nextLine();
            PrimeraPal = cadena.substring(0,cadena.indexOf(" "));
            ultPal = cadena.substring(cadena.lastIndexOf(" ")+1);
            intentos++;
        }while (PrimeraPal.equals(ultPal));

        System.out.println("Has introducido "+intentos+" frases encadenables ");//Me faltaria poner (intentos-1)
    }
}
