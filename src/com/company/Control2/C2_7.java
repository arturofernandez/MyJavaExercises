/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que haga la conversión de grados Celsius a Fahrenheit (( ºC x 9/5)+32 = ºF)
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introcue una temperatura en grados Centigrados");
        double temp = entrada.nextDouble();

        System.out.println(aFahrenheit(temp) + "ºF");
    }
    public static double aFahrenheit(double t){
        double tempF = ((t*9)/5)+32;
        return tempF;
    }
}
