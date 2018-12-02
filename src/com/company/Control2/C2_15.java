/*
 * @author ARTURO FERNANDEZ
 * @version 02/12/2018
 * @description:Escribe un método estático que reciba un número entero de dos o más cifras y devuelva dicho número del revés. (374 -> 473).
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero de dos o mas cifras: ");
        int num = entrada.nextInt();
        System.out.println("El numero del revés es: "+numDelReves(num));
    }
    public static int numDelReves(int n){
        int numInvert = 0;
        int cifra = 0;
        while(n!=0){
            cifra = n%10;
            numInvert=(numInvert*10)+cifra;
            n/=10;
        }
        return numInvert;
    }
}
