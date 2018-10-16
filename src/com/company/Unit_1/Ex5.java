/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
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
