/*
 * @author ARTURO FERNANDEZ
 * @version 02/12/2018
 * @description: Escribe un método estatico que te reciba la base y la altura de un triangulo y te calcule el área.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base del triangulo:");
        double base = entrada.nextDouble();
        System.out.println("Introduce la altura del triangulo:");
        double altura = entrada.nextDouble();
        System.out.println("El area del triangulo es de: "+areaTriangulo(base,altura));
    }
    public static double areaTriangulo(double b, double a){
        double area = (b*a)/2;
        return area;
    }
}
