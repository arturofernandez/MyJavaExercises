/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
import java.util.Locale;
import java.util.Scanner;
public class Ex12 {
    public static void main(String [] args){
        System.out.println("Introduce the current temperature in " + "\u00b0" + "C");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double celsius = sc.nextDouble();
        
        double fahrenheit = ((9*celsius)/5) + 32;
        System.out.println("The temperature is " + fahrenheit + "\u00b0" + "F");

    }
}
