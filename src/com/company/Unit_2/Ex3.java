/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description
 * Dada la clase Point, escribe un programa que cree un objeto de tipo Point, solicite al usuario la nueva posición
 * del punto y lo mueva a dicha localización.
 */
package com.company.Unit_2;
import java.awt.Point;
import java.util.Scanner;
public class Ex3 {
    public static void main (String [] args){

        Point punto = new Point(10,10);

        System.out.println("Introduce la nueva posición del punto "+punto.getLocation());

        System.out.println("Cordenada X:");
        Scanner entrada = new Scanner(System.in);
        int posX = entrada.nextInt();

        System.out.println("Cordenada Y:");
        int posY = entrada.nextInt();

        punto.move(posX,posX);
        System.out.println("El punto se ha movido satisfactoriamente a la posición ("+posX+","+posY+")");


    }
}
