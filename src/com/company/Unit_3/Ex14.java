/*
 * @author ARTURO FERNANDEZ
 * @version 19/10/2018
 * @description
 * Escribe una clase programa Java cuyo método main simule una calculadora. Consideraremos que las operaciones
 * posibles son del tipo “num1 operador num2”, donde num1 y num2 son cualesquiera dos n´umeros reales y operador
 * es uno de +, -, *, /. El programa pedir´a al usuario el valor de num1, despu´es el operador y finalmente el valor
 * de num2. Tras esto, mostrar´a el resultado de la operación.
 *
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        String operador = entrada.next();
        int num2 = entrada.nextInt();

        switch (operador){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
        }
    }
}
