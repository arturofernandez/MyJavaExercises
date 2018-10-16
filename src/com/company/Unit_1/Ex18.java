/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
import java.util.Scanner;
public class Ex18 {
    public static void main(String args[]){
        System.out.println("Dime la hora de salida:");
        Scanner entrada = new Scanner (System.in);
        int horaSalida = entrada.nextInt();

        System.out.println("Dime los minutos de salida:");
        int minutoSalida = entrada.nextInt();

        System.out.println("Dime la hora de llegada:");
        int horaLlegada = entrada.nextInt();

        System.out.println("Dime los minutos de legada:");
        int minutosLlegada = entrada.nextInt();

        int duracionInicial = ((horaLlegada-horaSalida)*60)+((minutosLlegada-minutoSalida));
        System.out.println("Duracion inicial: " + duracionInicial + " minutos");

        int nuevaHoraLleda = (int) (((horaLlegada-horaSalida)*0.15)+(horaLlegada-horaSalida))+(horaSalida);
        int nuevoMinutosLlegada = (int) ((minutosLlegada-minutoSalida)*0.15+(minutosLlegada-minutoSalida))+(minutoSalida);
        int nuevaDuracion = (int) (duracionInicial-(duracionInicial*0.15));

        System.out.println("Nueva hora de llegada: "+nuevaHoraLleda);
        System.out.println("Nuevos minutos de llegada: "+nuevoMinutosLlegada);
        System.out.println("Nueva duraci\u00f3n: " + nuevaDuracion + " minutos");


    }
}
