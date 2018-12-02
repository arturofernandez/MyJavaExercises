/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que reciba dos números enteros y devuelva la suma entre ellos.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer sumando:");
        int num = entrada.nextInt();
        System.out.println("Introduce el segundo sumando:");
        int num2 = entrada.nextInt();

        System.out.println("El resultado de "+num+ " + "+num2+ " = "+suma(num,num2));

    }

    public static int suma (int num, int num2){
        int result = 0;
        result = num + num2;
        return result;
    }
}
