/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description
 * Dada la clase Point, escribe un programa que pida las coordenadas de un objeto de tipo Point, lo cree y muestre
 * true si pertenece al primer cuadrante (esto es, ambas coordenadas son positivas) o false en caso contrario.
 */
package com.company.Unit_2;
import java.awt.Point;
import java.util.Scanner;
public class Ex4 {
    public static void main (String [] args){
        System.out.println("Introduce las cordenadas de un punto en el espacio:");

        System.out.println("Cordenada X:");
        Scanner entrada = new Scanner(System.in);
        int posX = entrada.nextInt();

        System.out.println("Cordenada Y");
        int posY = entrada.nextInt();

        Point punto = new Point(posX,posY);
        System.out.println("Es el punto "+punto.getLocation()+" del primer cuadrante?");
        System.out.println((punto.getX())>0 && (punto.getY())>0);

    }
}
