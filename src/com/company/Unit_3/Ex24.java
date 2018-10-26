/*
 * @author ARTURO FERNANDEZ
 * @version 20/10/2018
 * @description
 *
 * Escribe una clase programa Java cuyo método main determine el menor núumero de billetes y monedas necesario
 * para cubrir una cantidad dada de euros (cambio ´optimo). Por ejemplo, para una cantidad de 1755.45 euros el
 * cambio optimo es tres billetes de 500 euros, uno de 200, uno de 50, uno de 5, dos monedas de 20 céntimos y una
 * moneda de 5 c´entimos.
 *
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dinero = entrada.nextDouble();

        int billete500 = 0;
        int billete200 = 0;
        int billete100 = 0;
        int billete50 = 0;
        int billete5 = 0;
        int moneda1 =  0;

        double restante = 0;

        if((dinero%500)==0){
            restante = dinero/500;
            System.out.println(restante + " de 500");
        }
        if((dinero%200)==0){
            restante = restante/200;
            System.out.println(restante + " de 200");
        }
        if((dinero%100)==0){
            restante = restante/100;
            System.out.println(restante + " de 100");
        }
        if((dinero%50)==0){
            restante = restante/50;
            System.out.println(restante + " de 50");
        }
        if((dinero%5)==0){
            restante = restante/5;
            System.out.println(restante + " de 5");
        }
        if((dinero%1)==0){
            restante = restante/1;
            System.out.println(restante + " de 1");

        }
    }
}
