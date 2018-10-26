/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description:
 *
 * Una compañia de transporte ha adquirido recientemente nuevos camiones que son mas rapidos. La compañia
 * pretende averiguar como afecta esto al tiempo de los viajes. Suponiendo que la reducción de tiempo es del 15 %,
 * escribe un programa en Java que pregunte los tiempos de las salidas en horas y minutos (se supone que la salida
 * es siempre anterior a la llegada y que las horas y minutos vienen dadas en el rango correcto, esto es 0-23 y 0-59
 * respectivamente). Para viajes hechos en el mismo día, calcula la nueva hora de llegada y muestra por pantalla
 * la nueva duraci´on y la nueva hora de llegada.
 *
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
