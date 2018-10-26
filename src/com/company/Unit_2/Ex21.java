/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description:
 *
 * Escribe un programa en Java que cree y muestre una ventana con el título “Prueba” y tamaño (100,150), pregunte
 * a continuaci´on al usuario en qu´e proporción quiere cambiar el tama˜no de la ventana (un 50 % reduce la ventana
 * a la mitad, 200 % la aumenta al doble, etc.), y finalmente cambie el tamañoo de la ventana al tamañoo resultante
 *
 */
package com.company.Unit_2;
import javax.swing.*;
import java.util.Scanner;

public class Ex21 {
    public static void main(String [] args){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setTitle("Prueba");
        f.setSize(100,150);
        f.setVisible(true);

        System.out.println("Que proporcion en % quiere cambiar de la ventana?");
        Scanner entrada = new Scanner(System.in);
        int prop = (entrada.nextInt())/100;

        f.setSize((100*prop),(150*prop));
    }
}
