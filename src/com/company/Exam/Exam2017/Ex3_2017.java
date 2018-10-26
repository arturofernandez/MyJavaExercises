/*
 * @author ARTURO FERNANDEZ
 * @version 21/10/2018
 *
 */
package com.company.Exam.Exam2017;

import java.util.Locale;
import java.util.Scanner;

public class Ex3_2017 {
    public static void main(String[] args) {
            Scanner kbd = new Scanner(System.in).useLocale(Locale.US);
            int n1, n2, r = 0;
            char op;
            System.out.print("Primer operando: ");
            n1 = kbd.nextInt();
            do {
                System.out.print("Operador (+,-,*,/): ");
                op = kbd.next(".").charAt(0);
            } while (op != '+' && op != '-' && op != '*' && op != '/');
            do {
                System.out.print("Segundo operando: ");
                n2 = kbd.nextInt();
            } while (op == '/' && n2 == 0);
            switch (op) {
                case '+':
                    r = n1 + n2;
                    break;
                case '-':
                    r = n1 - n2;
                    break;
                case '*':
                    r = n1 * n2;
                    break;
                case '/':
                    r = n1 / n2;
                    break;
            }
            System.out.println("Resultado: " + r);
        }
    }

