/**
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex15 {
    public static void main (String [] args){
        System.out.println("Introduzca la cantidad a depositar:");
        Scanner entrada = new Scanner(System.in);
        double deposito = entrada.nextDouble();

        System.out.println("Introduzca un interés en porcentaje:");
        double interes = (entrada.nextDouble())/100;

        System.out.println("Introduzca un numero de meses para devolverlo:");
        int meses = (entrada.nextInt());

        double aPagar = ((deposito*interes)+deposito)/meses;

        System.out.println("La cantidad a pagar cada mes es de: "+aPagar+"€ al mes");

    }
}
