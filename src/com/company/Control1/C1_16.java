/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que te calcule el factorial del número introducido y te muestre el resultado por pantalla.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_16 {
    public static void main(String [] args){
        System.out.println("Introduce un numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int factorial = 0;
        int operacion = 0;
        for (int i = 1; (i-1)<numero;i++){
            if (i == 1){
                operacion = 1*i;
            }else {
                operacion= operacion*i;
            }
            factorial=operacion;
        }
        System.out.println("El factorial de "+numero+" es "+factorial);
    }
}
