/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description
 *
 * Escribe un programa en Java que solicite el nombre y los dos apellidos de una persona. A partir de dichos datos,
 * p. ej. Federico García Lorca, el programa debe mostrarlos por pantalla en los siguientes formatos:
 *      Nombre completo: ‘‘Federico García Lorca’’
 *      Inicial y apellidos: ‘‘F. García Lorca’’
 *      Apellidos y nombre: ‘‘García Lorca, Federico’’
 *      Iniciales: ‘‘F.G.L.’’
 *
 */
package com.company.Unit_2;
import java.util.Scanner;
public class Ex9 {
    public static void main(String [] args){
        System.out.println("Introduce your full name and surnames:");

        Scanner input = new Scanner(System.in);

        String fullName = input.nextLine();
        char initialLetter = fullName.charAt(0);
        String surnames = fullName.substring((fullName.indexOf(" "))+1);
        String name = fullName.substring(0,fullName.indexOf(" "));
        char initialLetter2 = surnames.charAt(0);
        String d = surnames.substring(surnames.indexOf(" ")+1,(surnames.indexOf(" "))+2);

        System.out.println("Full Name: ''"+fullName+"''");
        System.out.println("Initial Letter and Surnames: ''"+initialLetter+". "+surnames+"''");
        System.out.println("Surnames and Name: ''"+surnames+", "+name+"''");
        System.out.println("Initials: ''"+initialLetter+"."+initialLetter2+"."+d+".''");
    }
}
