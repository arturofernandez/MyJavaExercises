/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @title Hacer un programa el cual pida dos puntos y calcule la distancia entre estos.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_1 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Define la cordenada X del punto A");
        int posXA = entrada.nextInt();
        System.out.println("Define la cordenada Y del punto A");
        int posYA = entrada.nextInt();

        System.out.println("Define la cordenada X del punto B");
        int posXB = entrada.nextInt();
        System.out.println("Define la cordenada Y del punto B");
        int posYB = entrada.nextInt();

        double vectorEnX = Math.pow((posXA-posXB),2);
        double vectorEnY = Math.pow((posYA-posYB),2);

        double modulo = Math.sqrt(vectorEnX+vectorEnY);

        System.out.println("La distancia o modulo entre el punto A y el punto B es de: "+modulo+" unidades.");





    }
}
