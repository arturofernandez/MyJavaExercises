/*
 * @author ARTURO FERNANDEZ
 * @version 19/10/2018
 *  @description Escribe una clase programa Java cuyo método main lea dos n´umeros enteros, num1 y num2 y, después, escriba el
 *  mensaje “Producto positivo o cero” o “Producto negativo”. Est´a prohibido calcular el producto.
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        if (num1<0||num2<0){
            if (num1<0&&num2<0) {
                System.out.println("Producto positivo o 0");
            }else {
                System.out.println("Producto negativo");
            }
        }else {
            System.out.println("Producto positivo o 0");
        }

    }
}
