/*
 * @author ARTURO FERNANDEZ
 * @version 21/10/2018
 *
 */
package com.company.Exam.Exam2016;

import java.util.Scanner;

public class Ex4_2016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        String cadena = entrada.nextLine();
        int total = (cadena.length());
        double vocal = 0;
        for (int i = 0; i<cadena.length();i++){
            char letra = cadena.charAt(i);
            if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
               vocal+=1;
                System.out.println(vocal);
            }
        }
        double porcentaje = (vocal/total)*100;
        System.out.println("El porcentaje de vocales es: "+porcentaje);
    }
}
