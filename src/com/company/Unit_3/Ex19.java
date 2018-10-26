/*
 * @author ARTURO FERNANDEZ
 * @version 20/10/2018
 * @description Escribe una clase programa en Java que pide un entero que representa un mes y muestre por pantalla el número
 * de días del mes.
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero de Mes");
        int mes = entrada.nextInt();
        switch (mes){
            case 1:
                System.out.println("El Mes tiene 31 dias");
                break;
            case 2:
                System.out.println("El Mes tiene 28 dias");
                break;
            case 3:
                System.out.println("El Mes tiene 31 dias");
                break;
            case 4:
                System.out.println("El Mes tiene 30 dias");
                break;
            case 5:
                System.out.println("El Mes tiene 31 dias");
                break;
            case 6:
                System.out.println("El Mes tiene 30 dias");
                break;
            case 8:
                System.out.println("El Mes tiene 31 dias");
                break;
            case 9:
                System.out.println("El Mes tiene 30 dias");
                break;
            case 10:
                System.out.println("El Mes tiene 31 dias");
                break;
            case 11:
                System.out.println("El Mes tiene 30 dias");
                break;
            case 12:
                System.out.println("El Mes tiene 31 dias");
                break;
        }
    }
}
