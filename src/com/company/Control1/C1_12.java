/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que al introducir un número saque por pantalla si este es par o impar.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_12 {
    public static void main(String [] args){
        System.out.println("Introduce un numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero%2 == 0){
            System.out.println("El numero introducido es par.");
        }else{
            System.out.println("El numero introducido es impar.");
        }

    }
}
