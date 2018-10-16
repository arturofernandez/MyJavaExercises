/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que te solicite que escribas una frase
 *          y te devuelva cuantos espacios y cuantas letras contiene.
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_22 {
    public static void main(String [] args){
        System.out.println("Introduce una frase:");
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        int espacios = 0;
        int letras = 0;
        for(int i = 0; frase.length()>i;i++){
            if (frase.charAt(i)==' '){
                espacios = espacios+1;
            }else {
                letras = letras+1;
            }

        }
        System.out.println("La frase tiene "+espacios+" espacios y "+ letras+" letras.");
    }
}
