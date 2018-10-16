/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
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
