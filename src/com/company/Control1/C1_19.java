/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que pida por pantalla una serie de números y cuando ponga "0" que salga la suma de la serie.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_19 {
    public static void main(String [] args){
        System.out.println("Introduce una sucesion de numeros separados por espacios:");
        Scanner entrada = new Scanner(System.in);
        String serie = entrada.nextLine();
        int sumatorios = 0;
        for (int i= 0; serie.charAt(i)!='0';i+=2){
            int num = Integer.parseInt(serie.substring(0+i,i+1));
           sumatorios = sumatorios+num;
        }
        System.out.println("La suma de la serie es de "+sumatorios);
    }
}
