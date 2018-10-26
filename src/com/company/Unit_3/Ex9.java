/*
 * @author ARTURO FERNANDEZ
 * @version 19/10/2018
 * @description:
 * Escribe una clase programa Java que lea las dos coordenadas reales de un punto en un plano y después muestre
 * por pantalla si esa coordenada está situada en:
 *      • El primer cuadrante (x > 0, y > 0)
 *      • El segundo cuadrante (x < 0, y > 0)
 *      • El tercer cuadrante (x < 0, y < 0)
 *      • El cuarto cuadrante (x > 0, y > 0)
 *      • El eje de abscisas (x 6= 0, y = 0)
 *      • El eje de ordenadas (x = 0, y 6= 0)
 *      • El origen de coordenadas (x = 0, y = 0)
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las coordenadas reales de un punto en un plano:");
        System.out.println("Introduce las coordenada X:");
        int coordenadaX = entrada.nextInt();
        System.out.println("Introduce las coordenada Y:");
        int coordenadaY = entrada.nextInt();

        if (coordenadaX>0 && coordenadaY>0){
            System.out.println("Esta en el primer cuadrante");
        }
        if (coordenadaX<0 && coordenadaY>0){
            System.out.println("Esta en el segundo cuadrante");
        }
        if (coordenadaX<0 && coordenadaY<0){
            System.out.println("Esta en el tercer cuadrante");
        }
        if (coordenadaX>0 && coordenadaY<0){
            System.out.println("Esta en el cuarto cuadrante");
        }
        if (coordenadaX==0 && coordenadaY == 0){
            System.out.println("Esta en el centro del eje de coordenadas");
        }
        if (coordenadaX!=0 && coordenadaY==0){
            System.out.println("Esta en sobre el eje Y");
        }
        if (coordenadaX==0 && coordenadaY!=0){
            System.out.println("Esta en sobre el eje X");
        }

    }
}
