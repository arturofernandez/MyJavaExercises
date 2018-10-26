/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description:
 *
 * Escribe un programa en Java que cree un objeto de tipo Point en (0,0), pregunte al usuario donde debe situarlo
 * y lo sit´ue en dicho lugar. A continuaci´on se debe crear un nuevo objeto de tipo Point opuesto al primero.
 * Finalmente se debe mostrar por pantalla las coordenadas de ambos puntos.
 *
 */
package com.company.Unit_2;
import java.awt.Point;
import java.util.Scanner;
public class Ex19 {
    public static void main(String [] args){
        Point p = new Point(0,0);

        System.out.println("A que posición quiere mover el punto P?");
        System.out.println("Cordenada X:");
        Scanner entrada = new Scanner(System.in);
        int poxX = entrada.nextInt();

        System.out.println("Cordenada Y:");
        int posY = entrada.nextInt();

        p.move(poxX,posY);

    }
}
