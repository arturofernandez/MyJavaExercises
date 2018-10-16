package com.company.Control1;
import java.util.Scanner;
public class C1_3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String palabra = entrada.next();

        for (int i=0;i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }
    }
}
