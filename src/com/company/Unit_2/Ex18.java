/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description :
 * Escribe un programa en Java que solicite una URL en formato de String y muestre true si corresponde a una
 * URL con protocolo HTTP (puerto 80), o false en caso contrario. Utiliza los constructores y m´etodos de la clase
 * URL.
 */
package com.company.Unit_2;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Ex18 {
    public static void main(String [] args)throws MalformedURLException {
        System.out.println("Introduce a URL");
        Scanner input = new Scanner(System.in);
        String urlString = input.nextLine();

        URL url = new URL(urlString);
        System.out.println("Is your URL using the HTTP protocol (PORT:80)?");

        System.out.println((url.getProtocol()).equals("http"));
    }
}
