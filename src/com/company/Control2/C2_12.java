/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método estático que pida una palabra y que diga si se puede leer igual de izquierda a derecha y de derecha a izquierda o si no se puede.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = entrada.next();

        System.out.println("¿Esta palabra es capicua?: "+ esCapicua(palabra));
    }
    public static boolean esCapicua (String pal){
        boolean esCapicua = false;
        String palInvert ="";
        for (int i = pal.length()-1;i>=0;i-- ){
            palInvert+=pal.substring(i,i+1);
        }
        if (palInvert.equals(pal)){
            esCapicua = true;
        }
        return esCapicua;
    }
}
