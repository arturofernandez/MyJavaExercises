/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que solicite tu nombre de pila y el de tus padres y muestre true si tienes el mismo
 * nombre que uno de tus padres, o false en caso contrario.
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex11 {
    public static void main(String [] args){
        System.out.println("Introduce tu nombre de pila:");
        Scanner entrada = new Scanner (System.in);
        String tuNombrePila = entrada.nextLine();

        System.out.println("Introduce el nombre de pila de tu padre");
        String nombrePilaPadre = entrada.nextLine();

        System.out.println("Introduce el nombre de pila de tu madre");
        String nombrePilaMadre = entrada.nextLine();

        System.out.println("Son iguales tus nombres de pila que el de tus padres?");
        System.out.println(tuNombrePila.equals(nombrePilaPadre) || tuNombrePila.equals(nombrePilaMadre));

    }
}
