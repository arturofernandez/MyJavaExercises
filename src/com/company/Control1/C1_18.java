/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa en el que, a partir de las horas trabajadas, se calcule el salario diario de un trabajador al que se le paga 10€/hora. En el caso de que la jornada supere las 8 horas, cobra 15€/hora extra.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_18 {
    public static void main(String [] args){
        System.out.println("Introduce las horas diarias trabajadas:");
        Scanner entrada = new Scanner (System.in);
        double horas = entrada.nextDouble();
        double salario = 0;
        if (horas<=8){
            salario = horas*10;
            System.out.println("El salario que te corresponde por trabajar "+horas+" h, es de "+salario+" $.");
        }else{
            double horasExtra = horas-8;
            salario = (horasExtra*15)+80;
            System.out.println("El salario que te corresponde por trabajar "+horas+" h, es de "+salario+" $.");
        }
    }
}
