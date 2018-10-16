/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe tu nombre y apellido e indica cuales son las iniciales.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_24 {
    public static void main(String [] args){
        System.out.println("Introduce tu nombre y apellidos");
        Scanner entrada =new Scanner(System.in);
        String nombreAp = entrada.nextLine();
        String nom = nombreAp.substring(0,1);
        nom.toUpperCase();
        String ap = nombreAp.substring(nombreAp.indexOf(" ")+1,nombreAp.indexOf(" ")+2);
        ap.toUpperCase();
        System.out.println(nom+"."+ap);
    }
}
