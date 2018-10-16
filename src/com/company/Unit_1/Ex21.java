/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex21 {
    public static void main(String [] args){
        System.out.println("Introduce tu altura en metros");
        Scanner entrada = new Scanner (System.in);
        double altura = entrada.nextDouble();

        System.out.println("Introduce tu peso en kg");
        double peso = entrada.nextDouble();

        double formula = peso/Math.pow(altura,2);

        System.out.println(formula>=20 && formula<=25);
    }
}
