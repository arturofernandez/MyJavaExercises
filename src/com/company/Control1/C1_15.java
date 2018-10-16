/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que pida 3 notas de un examen, calcular la media y si es mayor que 5, mostrar por pantalla: "aprobado". En caso contrario mostrar por pantalla: "suspenso".
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_15 {
    public static void main(String [] args){
        System.out.println("Introduce la nota del Primer Examen:");
        Scanner entrada = new Scanner(System.in);
        double ex1 = entrada.nextDouble();
        System.out.println("Introduce la nota del Segundo Examen:");
        double ex2 = entrada.nextDouble();
        System.out.println("Introduce la nota del Tercer Examen:");
        double ex3 = entrada.nextDouble();

        double media = (ex1+ex2+ex3)/3;

        if (media>=5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspendido");
        }

    }
}
