/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que pida el radio de una esfera y calcule su volumen a partir de este.
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_13 {
    public static void main(String [] args){
        System.out.println("Introduce el radio de la esfera:");
        Scanner entrada = new Scanner(System.in);
        double radio = entrada.nextDouble();
        double vol = (4*(Math.PI)*(Math.pow(radio,3)))/3;
        System.out.println("El volumen de la esfera de radio "+radio+" es de "+vol+" unidades cúbicas.");
    }
}
