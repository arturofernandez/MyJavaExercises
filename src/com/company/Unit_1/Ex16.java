/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description  Escribe un programa en Java que pida la hora inicial (hora y minutos) y la hora final de una clase y muestre su
 * duracion en minutos. Por ej., para 10:30-12:15, ha de devolver 105 minutos.
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
