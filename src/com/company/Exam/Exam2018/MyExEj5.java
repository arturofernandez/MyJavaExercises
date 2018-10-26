/*
 * @author ARTURO FERNANDEZ
 * @version 22/10/2018
 *
 */
package com.company.Exam.Exam2018;

import java.util.Scanner;

public class MyExEj5 {
    public static void main(String[] args) {
        int num;
        boolean primo = false;
        do {
            Scanner entada = new Scanner(System.in);
            System.out.println("Introduce un entero");
            num = entada.nextInt();

        }while (num<0);

        if ((num%num)==0&&(num%1)==0){
            primo = true;
        }else {
            primo = false;
        }

        System.out.println("¿Es el numero primo? "+primo);
    }
}
