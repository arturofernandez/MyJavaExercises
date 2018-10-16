/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @title Escribe un programa que te permita obtener la fuerza gravitacional que existe entre dos cuerpos cualquiera, que elegirá el ejecutor del programa. Fórmula fuerza gravitacional : G*M*m/r^2 ,
 * donde G, la constante de gravitación universal = 6.67*10^-11.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_9 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el la Masa M");
        double M = entrada.nextDouble();

        System.out.println("Introduce el la Masa m");
        double m = entrada.nextDouble();

        System.out.println("Introduce el la el Radio R");
        double R = entrada.nextDouble();

        double G = (6.67)*(Math.pow(10,-11));
        double fuerza = (G*M*m)/(Math.pow(R,2));

        System.out.println("La Fuerza Gravitacional es de: "+fuerza+" N");
    }
}
