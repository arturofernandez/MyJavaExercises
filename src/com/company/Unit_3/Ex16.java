/*
 * @author ARTURO FERNANDEZ
 * @version 20/10/2018
 * @description
 *
 * Escribe una clase programa Java que calcule el coste de un menú en un restaurante de comida rápida. El coste
 * básico del men´u es 5.99 euros. Los siguientes factores modifican ese precio:
 *      • El tamaño del menú: normal (mismo precio), grande (+15%), extra-grande (+25%), para niños (-10%).
 *      • Ingredientes extra: patatas (+1 euro), pan de ajo (+0.5 euros), salsa extra (+0.5 euros).
 *      • Postre: +1.5 euros.
 *
 */
package com.company.Unit_3;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el tipo de menu:");
        String tipoMenu = entrada.nextLine();

        System.out.println("¿Quiere ingredientes extra?");
        String ingredientesExtra = entrada.nextLine();

        double menuBasico = 5.99;
        double costeMenu = 0;

        if(tipoMenu.equals("Normal")){
            costeMenu = menuBasico;
        }
        if(tipoMenu.equals("Grande")){
            costeMenu = (menuBasico*0.15)+menuBasico;
        }
        if(tipoMenu.equals("Extra-Grande")){
            costeMenu = (menuBasico*0.25)+menuBasico;
        }
       if(tipoMenu.equals("Infantil")){
            costeMenu = (menuBasico*0.10)-menuBasico;
        }
        if (ingredientesExtra.equals("Si")) {
            System.out.println("Introduce los ingredientes extra:");
            String ingredientes = entrada.nextLine();
            if (ingredientes.equals("patatas")) {
                costeMenu = (costeMenu) + 1;
            }
            if (ingredientes.equals("pan de ajo")) {
                costeMenu = (costeMenu) + 0.5;
            }
            if (ingredientes.equals("salsa extra")) {
                costeMenu = (costeMenu) + 0.5;
            }
        }
        System.out.println("¿Quiere postre?");
        String postre = entrada.nextLine();

            if (postre.equals("Si")) {
                costeMenu = costeMenu + 1.5;
            }

        System.out.println("El coste del menu es de "+costeMenu+" $");

    }
}
