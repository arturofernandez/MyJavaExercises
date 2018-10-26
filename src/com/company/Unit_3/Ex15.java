/*
 * @author ARTURO FERNANDEZ
 * @version 19/10/2018
 * @description
 * Escribe una clase programa Java que permite obtener la nota cualitativa (Suspenso, Aprobado, Notable, Sobresaliente)
 * a partir de la nota numérica en el rango [0-10]. El programa debe pedir la nota num´erica y, en caso de
 * que sea válida, mostrar la nota cualitativa. Si el valor num´erico no es correcto, se debe mostrar un mensaje de error.
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota del examen:");
        double nota = entrada.nextDouble();
        if (nota>=0&&nota<=10){
            if (nota<5){
                System.out.println("Suspenso");
            }
            if (nota>=5&&nota<=6){
                System.out.println("Aprobado");
            }
            if (nota>=7&&nota<=8){
                System.out.println("Notable");
            }
            if (nota>=9){
                System.out.println("Sobresaliente");
            }
        }else {
            System.out.println("La nota introducida no es correcta");
        }
    }
}
