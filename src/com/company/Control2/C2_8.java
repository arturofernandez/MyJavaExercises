/*
 * @author ARTURO FERNANDEZ
 * @version 01/12/2018
 * @description: Escribe un método que invierta el órden de los números de tu número de teléfono (int)
 *
 */
package com.company.Control2;

import java.util.Scanner;

public class C2_8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero de telefono");
        int num = entrada.nextInt();
        System.out.println("El numero de telefono invertido es: "+ numInvert(num));

    }
    public  static int numInvert (int n){
        int nInvert= 0;
        int cifra = 0;
        while(n!=0){
            cifra = n%10;
            nInvert=(nInvert*10)+cifra;
            n/=10;
        }
        return nInvert;
    }
}
