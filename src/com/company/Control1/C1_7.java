/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @title Crea un programa donde se pidan los coeficientes de una ecuación se 2º grado, y muestra sus soluciones reales.
 * Si no existen, debes indicarlo.
 *
 */

package com.company.Control1;
import java.util.Scanner;
public class C1_7 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer coeficiente de una ecuacion de segundo grado");
        int a = entrada.nextInt();

        System.out.println("Introduce el segundo coeficiente");
        int b = entrada.nextInt();

        System.out.println("Introduce el tercer coeficiente");
        int c = entrada.nextInt();

        double eqPositiva = (-b)+(Math.sqrt(Math.pow(b,2)-(4*a*c)));
        double eqNegativa = (-b)-(Math.sqrt(Math.pow(b,2)-(4*a*c)));
        double solPositiva = (eqPositiva/2*a);
        double solNegativa = (eqNegativa/2*a);
        if (Double.isNaN(solNegativa)  && Double.isNaN(solPositiva)) {
            System.out.println("Las solciones no pertenecen a los reales");
        }else {
            System.out.println("Las solciones son:"+solNegativa+ " y "+ solPositiva);
        }

    }

}
