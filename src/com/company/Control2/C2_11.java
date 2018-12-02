/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método en el que des una letra y te muestre por pantalla cuál es su posición en el abecedario.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una letra");
        String letra = entrada.next();

        System.out.println("La psosicion de la letra "+letra+" es "+posicionLetra(letra));
    }
    public static int posicionLetra(String letra){
        int pos =0;
        String alf = "abcdefghijkmnopqrstuvwxyz";

        letra = letra.substring(0,1);

        pos = alf.indexOf(letra);

        return pos;

    }
}
