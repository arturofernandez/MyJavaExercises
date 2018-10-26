/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description:
 * Escribe un programa en Java que pida al usuario un título y un tamaño y cree una ventana cuadrada (objeto
 * de tipo JFrame) con ese título y tamaño.
 */
package com.company.Unit_2;
import javax.swing.JFrame;
import java.util.Scanner;
public class Ex20 {
    public static void main(String [] args){
        System.out.println("Set a OS Window Title:");
        Scanner input = new Scanner(System.in);
        String winTitle = input.nextLine();

        System.out.println("Set the OS Window size:");
        System.out.println("Set width:");
        int winWidth = input.nextInt();

        System.out.println("Set height:");
        int winheight = input.nextInt();

        JFrame f = new JFrame(winTitle);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(winWidth,winheight);
        f.setVisible(true);

    }
}
