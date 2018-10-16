/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
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
