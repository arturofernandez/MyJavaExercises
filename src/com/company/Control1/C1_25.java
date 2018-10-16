package com.company.Control1;

import java.util.Scanner;

public class C1_25 {
    public static void main(String [] args){
        System.out.println("Introduce tu nombre y apellidos");
        Scanner entrada = new Scanner(System.in);
        String NombreCompleto = entrada.nextLine();

        String inicialNom = NombreCompleto.substring(0,1);
        String inicialAp1 = NombreCompleto.substring(NombreCompleto.indexOf(" ")+1,NombreCompleto.indexOf(" ")+2);
        String primerApellido = NombreCompleto.substring(NombreCompleto.indexOf(" ")+1);
        String inicialAp2 = primerApellido.substring(primerApellido.indexOf(" ")+1,primerApellido.indexOf(" ")+2);

       String caracteres = NombreCompleto.substring(0,NombreCompleto.indexOf(" "))+
               primerApellido.substring(1,primerApellido.indexOf(" "))+primerApellido.substring(primerApellido.indexOf(" "));

        System.out.println("Tu nombre tiene "+caracteres.length()+" cacacteres, iniciales: "+inicialNom+"."+inicialAp1+"."+inicialAp2);



    }
}
