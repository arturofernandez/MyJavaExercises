/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description ¿Qu´e muestra por pantalla el siguiente programa cuando se introduce -10? Y cuando se introduce 45? Y cuando
 * se introduce 0?
 */
package com.company.Unit_1;
import java.util.Locale;
import java.util.Scanner;
public class Ex19 {
        public static void main(String [] args) {
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Inserta un numero entero: ");
            int n = entrada.nextInt();
            System.out.print("Es negativo? ");
            System.out.println(n < 0);
        }
    }

