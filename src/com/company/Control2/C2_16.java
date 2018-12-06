/*
 * @author ARTURO FERNANDEZ
 * @version 02/12/2018
 * @description: Escribe un método que reciba dos números enteros y los reste.
  * En caso de que el resultado sea positivo, devolver "true"; en caso de no serlo, devolver "false". (Contar el número 0 como positivo).
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserta un primer sumando");
        int num1 = entrada.nextInt();
        System.out.println("Inserta un segundo operando");
        int num2 = entrada.nextInt();

        System.out.println("¿La diferencia entre ambos numeros resulta positiva?: "+esRestaNegativa(num1,num2));
    }
    public static boolean esRestaNegativa(int n1, int n2){
        boolean esPos= false;
        int resta = n1-n2;
        if (resta>=0){
           esPos = true;
        }
        return esPos;
    }
}
