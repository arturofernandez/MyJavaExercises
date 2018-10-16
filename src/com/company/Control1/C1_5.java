package com.company.Control1;
import java.util.Scanner;
import java.util.Locale;
public class C1_5 {
    public static void main(String [] args){
        Scanner entrada =new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce la distancia recorrida en Km");
        double distanciaEnKm = entrada.nextDouble();
        double distanciaEnM = distanciaEnKm*1000;

        System.out.println("Introduce el tiempo transcurrido en recorrer la distancia anterior en horas");
        double tiempoEnH = entrada.nextDouble();
        double tiempoEnS = tiempoEnH*3600;

        double velocidadConDecimales = (distanciaEnM)/(tiempoEnS);
        int velocidadSinDecimales = (int) velocidadConDecimales;//Casting

        System.out.println("La velocidad del vehiculo es de: "+velocidadSinDecimales +" m/s");


    }
}
