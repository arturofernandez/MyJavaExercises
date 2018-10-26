/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 * @description Escribe una instrucción en java que, suponiendo que las variables x, y, y z estan declaradas como double, asigne
 * a z el valor resultado de la siguiente formula: 1+((x^2)/y)/(x^3)/(1+y)

 */
package com.company.Unit_1;
public class Ex5 {
    public static void main(String [] args){
        double x,y,z;
        x=10;
        y=20;
        z = 1+(Math.pow(x,2)/y)/(Math.pow(x,3)/1+y);
        int i = (int) z;
        System.out.println("If X values: "+x+" and Y values: "+y+" Z equals: "+i);
    }
}
