/*
 * @author ARTURO FERNANDEZ
 * @version 22/10/2018
 *
 */
package com.company.Exam.Exam2018;

import java.util.Scanner;

public class MyExEj4 {
    public static void main(String[] args) {
        double promedio = 0;
        double num = 0;
        boolean mas2metros = false;
        double alt;
        do {
            num+=1;
            Scanner entrada = new Scanner(System.in);
            alt = entrada.nextDouble();
            System.out.println("Introduce alturas");
            promedio = (promedio+alt)/num;//El promedio está mal deberia haver sumado todas las alturas y leugo hacer el promedio
            if (alt>2){
                mas2metros = true;
            }
        }while (alt>0);

        System.out.println("Promedio "+promedio+" hay alguna mas de 2 metros "+mas2metros);
    }
}

