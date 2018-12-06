/*
 * @author ARTURO FERNANDEZ
 * @version 29/11/2018
 * @description: Escribe un método estático que reciba un String y devuelva true si la longitud de la cadena es un número primo.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = entrada.nextLine();
        System.out.println("Es el numero de caracteres un numero primo: "+dimeSiCadenaEsPrimo(cadena));
    }
    public static boolean dimeSiCadenaEsPrimo(String cadena){
        boolean esPrimo = true;
        int numeroCaract = cadena.length();
        for (int i=2;i<numeroCaract;i++){
            int op = numeroCaract%i;
            if (op==0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}
