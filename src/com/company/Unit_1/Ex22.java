/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que pida un n´umero entero y escriba true si el n´umero es positivo impar o false
 * si no.
 *
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex22 {
    public static void main(String [] args){
        System.out.println("Introduce un numero entero, por favor:");
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        System.out.println(numero>0 && (((numero-1)%2)==0));


    }
}
