/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description:
 * Escribe un programa en Java que solicite una frase y muesrte cuántos espacios en blanco hay al inicio y final de
 * la frase (pista: usa trim).
 */
package com.company.Unit_2;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
public class Ex17 {
    public static void main (String [] args) throws MalformedURLException {
        System.out.println("Introduce the first URL:");
        Scanner input = new Scanner (System.in);
        String firstString = input.nextLine();
        URL firstURL = new URL(firstString);

        System.out.println("Introduce the second URL:");
        String secondString = input.nextLine();
        URL secondURL = new URL(secondString);

        System.out.println("Are the first and the second URL coming form the same host?");

        String firstHost = firstURL.getHost();
        String secondHost = secondURL.getHost();

        System.out.println(firstHost.equals(secondHost));
    }
}
