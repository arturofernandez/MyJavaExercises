/*
 * @author ARTURO FERNANDEZ
 * @version 21/10/2018
 *
 */
package com.company.Exam.Exam2017;
import java.util.Scanner;
public class Ex1_2017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = entrada.nextInt();

        System.out.println("Introduce 1 si eres Obeso y 0 si no lo eres:");
        int obesidad = entrada.nextInt();

        System.out.println("Introduce 1 si haces deporte de forma continua y 0 si no");
        int deporte = entrada.nextInt();

        double riesgo = 0;

        if (edad>=0 && edad<=18){
            riesgo = 0;
        }
        if (edad>=19&&edad<=40){
            riesgo = edad*0.1;
        }
        if(edad>=41&&edad<=60){
            riesgo = ((edad-40)*0.2)+4;
        }
        if (edad>60){
            riesgo = ((edad-60)*0.1)+8;
        }
        if (obesidad==1){
            riesgo+=2;
        }
        if (edad<=60 && deporte==1){
            riesgo = (riesgo+0.3)-riesgo;
        }
        if (edad>60){
            riesgo = (riesgo+0.2)-riesgo;
        }
        if (riesgo>10){
            riesgo =10;
            System.out.println("Tu reisgo es de "+riesgo);
        }else {
            System.out.println("Tu riesgo es de "+riesgo);
        }

    }
}
