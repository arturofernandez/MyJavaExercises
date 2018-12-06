/*
 * @author ARTURO FERNANDEZ
 * @version 02/12/2018
 * @description: Escribe un metodo estatico Java para determinar si un numero entero positivo n > 0 dado es primo o no.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = entrada.nextInt();
        System.out.println("¿Es primo?: "+esPrimo(num));
    }
    public static boolean esPrimo(int n){
        boolean esPrimo = true;
        for (int i=2; i<n;i++){
            if ((n%i)==0){
                esPrimo = false;
            }
        }
        return  esPrimo;
    }
}
