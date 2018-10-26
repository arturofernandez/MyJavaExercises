/*
 * @author ARTURO FERNANDEZ
 * @version 19/10/2018
 * @description:
 * Una tienda de productos electrónicos va a cerrar definitivamente y por ello vende su stock aplicando diferentes
 * descuentos dependiendo de la cantidad de productos que se adquieran:
 *      • Cuando el total es menor de 500 euros, no se aplica ning´un descuento.
 *      • Cuando el total es mayor o igual a 500 euros y menor o igual a 2000 euros, se aplica un descuento del 30%.
 *      • Cuando el total es mayor de 2000 euros, se aplica un descuento del 50%.
 *
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de $ de la compra:");
        double total = entrada.nextDouble();
        if (total>=500){
            if (total<=2000){
               total = total-(total*0.3);
            }else {
                total = total-(total*0.5);
            }
        }else{
            System.out.println("No teienes descuento el precio final:"+total+"$");
        }
        System.out.println("Precio final:"+total+"$");
    }
}
