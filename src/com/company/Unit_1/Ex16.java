/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex16 {
    public static void main(String [] args){
        System.out.println("Introduce la hora inicial y final de la clase:");
        Scanner entrada = new Scanner (System.in);

        String hora = entrada.nextLine();

        int horaInicial = Integer.parseInt((hora.substring(hora.length()-9)));
        System.out.println(horaInicial);

    }
}
