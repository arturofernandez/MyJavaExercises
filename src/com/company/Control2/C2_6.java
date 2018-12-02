/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que pida un número e indique si es un número par.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_6 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);

        System.out.println("Introduce un numero:");
        int num = entrada.nextInt();

        System.out.println("¿Es el numero introducido par?: "+ esPar(num));
    }

    public static boolean esPar (int n){
        boolean esPar = false;

        if (n%2 == 0){
            esPar = true;
        }
        return esPar;
    }
}
