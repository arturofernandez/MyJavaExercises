/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que te pida un número entero y te diga si este es múltiplo de 3.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_17 {
    public static void main(String [] args){
        System.out.println("Introduce un numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero%3 == 0){
            System.out.println(numero+" es multiplo de 3.");
        }else{
            System.out.println(numero+" no es multiplo de 3.");
        }

    }
}
