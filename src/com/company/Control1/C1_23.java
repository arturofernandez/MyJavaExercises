/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Realiza un programa que muestre por pantalla los números primos que existen entre el 100 y el 1
 *
 */
package com.company.Control1;
public class C1_23 {
    public static void main(String [] args){
        int contador = 1;
        int contador2 = 2;
        int resto = 1;
        boolean bandera = true;
        while(contador<=100){
            contador2 = 2;
            bandera = true;
            while(contador>contador2){
                resto = contador%contador2;
                if(resto==0){
                    bandera = false;
                }
                contador2++;
            }
            if (bandera) {
               System.out.println("El numero "+contador+" es primo");
            }
            contador++;
        }
    }
}
