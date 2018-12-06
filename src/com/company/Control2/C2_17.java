/*
 * @author ARTURO FERNANDEZ
 * @version 02/12/2018
 * @description: Escribe un método estático que pida un número entero y devuelva el número convertido a binario.
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        System.out.println("Su representacion en binario es: "+aBinario(num));
    }
    public static String aBinario(int n){
        String bin ="";
        while (n>0){
            if (n%2==0){
                bin="0"+bin;
            }else{
                bin="1"+bin;
            }
            n/=2;
        }
        return bin;
    }
}
