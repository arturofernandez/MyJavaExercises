/*
 * @author ARTURO FERNANDEZ
 * @version 14/10/2018
 * @title Escribe un programa que pida un número del 1 al 7 y diga el día de la semana correspondiente.
 *
 */
package com.company.Control1;
import java.util.Scanner;
public class C1_11 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero del dia de la semana:");
        int numeroDia = entrada.nextInt();
        switch (numeroDia){
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sábado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                if (numeroDia<1 || numeroDia>7){
                    System.out.println("Numero de día incorrecto");
                }else {
                    System.out.println("Entrada de datos incorrecta");
                    break;
                }
        }
    }
}
