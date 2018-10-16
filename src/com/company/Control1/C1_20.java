/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Realiza un programa que te pida el dividendo y el divisor, y te calcule si la división es exacta o no.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_20 {
    public static void main(String [] args){
        System.out.println("Introduce el dividendo:");
        Scanner entrada = new Scanner(System.in);
        double dividendo = entrada.nextDouble();

        System.out.println("Introduce el divisor:");
        double divisor = entrada.nextDouble();
        double resto = dividendo%divisor;
        while (dividendo<divisor){
            dividendo = dividendo*10;
        }
        if (dividendo%divisor == 0){
            System.out.println("Es exacta");
        }else {
            System.out.println("No es exacta");
        }

    }
}
