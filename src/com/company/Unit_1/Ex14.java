/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe un programa en Java que pregunte la cantidad a pagar y el porcentaje de IVA y devuelva por pantalla
 * el total a pagar.
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex14 {
    public static void main(String [] args){
        System.out.println("La cantidad a pagar es de :");
        Scanner entrada = new Scanner(System.in);
        double coste = entrada.nextDouble();
        double iva = 0.21;
        double coste_final = (coste*iva)+(coste);

        System.out.println("La cantidad total a pagar es de: "+coste_final);
    }
}
