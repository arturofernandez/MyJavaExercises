/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que pida dos números y muestre si su división es exacta.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el dividendo:");
        double num1 = entrada.nextDouble();

        System.out.println("Introduce el divisor:");
        double num2 = entrada.nextDouble();

        System.out.println("El resultado de "+num1+"/"+num2+ " = "+divisionExacta(num1,num2));
    }

    public static int divisionExacta(double n, double n2){
        int result = (int) (n/n2);
        return result;
    }
}
