/*
 * @author ARTURO FERNANDEZ
 * @version 08/10/2018
 */
package com.company.Unit_1;
public class Ex8 {
    public static void main(String [] args){

        double radius = 6;

        double area = 4*Math.PI*Math.pow(radius,2);
        double volume = (4*Math.PI*Math.pow(radius,3))/3;
        double vol_area = 3/radius*area;

        System.out.println("If the sphere has a radious of "+radius+" u "+" the area equals "+area+" and it's volume equals "+volume);

    }
}
