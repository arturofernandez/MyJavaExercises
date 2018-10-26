/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que pida la edad y escriba true si eres adulto (mayor o igual a 18 años) y false
 * si no.
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex20 {
    public static void main(String [] args){
        System.out.println("Introduce tu edad, por favor:");
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        System.out.println("¿Eres mayor de edad?");
        System.out.println(edad>=18);

    }
}
