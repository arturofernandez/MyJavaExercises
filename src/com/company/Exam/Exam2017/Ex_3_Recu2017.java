/*
 * @author ARTURO FERNANDEZ
 * @version 21/10/2018
 *
 */
package com.company.Exam.Exam2017;

import java.util.Locale;
import java.util.Scanner;

public class Ex_3_Recu2017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce la operacion:");
        String operacioComp = entrada.nextLine();

        String num2, num1;
        int ValorNum1,ValorNum2;
        double result = 0;
        for (int i =0;i<operacioComp.length();i++){
            char op = operacioComp.charAt(i);
            switch (op){
                case '+':
                    num1 = operacioComp.substring(0,operacioComp.indexOf("+"));
                    ValorNum1 = Integer.parseInt(num1);

                    num2 = operacioComp.substring(operacioComp.indexOf("+")+1);
                    ValorNum2 = Integer.parseInt(num2);

                    result = ValorNum1+ValorNum2;
                    break;
                case '-':
                    num1 = operacioComp.substring(0,operacioComp.indexOf("-"));
                    ValorNum1 = Integer.parseInt(num1);

                    num2 = operacioComp.substring(operacioComp.indexOf("-")+1);
                    ValorNum2 = Integer.parseInt(num2);

                    result = ValorNum1-ValorNum2;
                    break;
                case '*':
                    num1 = operacioComp.substring(0,operacioComp.indexOf("*"));
                    ValorNum1 = Integer.parseInt(num1);

                    num2 = operacioComp.substring(operacioComp.indexOf("*")+1);
                    ValorNum2 = Integer.parseInt(num2);

                    result = ValorNum1*ValorNum2;
                    break;
                case '/':
                    num1 = operacioComp.substring(0,operacioComp.indexOf("/"));
                    double ValorNum4 = Double.parseDouble(num1);

                    num2 = operacioComp.substring(operacioComp.indexOf("/")+1);
                    double ValorNum3 = Double.parseDouble(num2);

                    result = (ValorNum4/ValorNum3);
                    break;
            }
        }
        System.out.println(result);
    }
}
