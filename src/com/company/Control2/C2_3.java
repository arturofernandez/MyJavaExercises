/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que reciba dos números enteros y muestre todos los números comprendidos entre ellos.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el infimo del intervalo");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el supremo del intervalo");
        int num2 = entrada.nextInt();

        System.out.println("Los numeros entre "+num1+" y "+num2+ ": " + intervalo(num1,num2));

    }

    public static String intervalo (int num1, int num2){
        String num = "";
        for (int i = num1+1; i<num2; i++){
            num += Integer.toString(i) + " ";
        }
        return num;
    }
}
