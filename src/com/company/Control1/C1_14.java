/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que calcule el gasto en euros de combustible, si realizamos un trayecto de 780 km en caravana. Sabemos que la caravana gasta unos 16,4 L / 100 km.
 *
 */
package com.company.Control1;
public class C1_14 {
    public static void main(String [] args){
        int trayecto = 780;
        double gastoKmPorL = 16.4/100;
        double precioPetrol =  1.48;
        double gastoFinal = (780*16.4)/100;
        double precioFinal = gastoFinal*precioPetrol;

        System.out.println("El coste de combustible de la caravana tras 780km es de: "+precioFinal+" $.");

    }
}
