/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que lea un numero entero y muestre sus divisores.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = entrada.nextInt();
        System.out.println("los divisores de "+num+" son: "+divisores(num));

    }
    public static String divisores (int n){
        String divisores = "";
        for (int i = 1; i<=n;i++){
            if (n%i==0){
                divisores+=i+" ";
            }
        }
        return divisores;
    }
}
