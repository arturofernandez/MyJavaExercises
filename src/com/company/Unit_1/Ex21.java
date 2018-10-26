/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que pida tu altura (en metros) y tu peso (en kilos) y devuelva true si tu condición
 * es saludable (esto es, tu peso dividido por el cuadrado de tu altura está entre 20 y 25, ambos incluidos) o false si no.
 *
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
