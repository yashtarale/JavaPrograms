package com.company;

import java.util.Scanner;

public class formulaExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valu of 1st number.");
        double v = sc.nextInt();
        System.out.println("Enter the valu of 2nd number.");
        double u = sc.nextInt();
        System.out.println("Enter the valu of 3rd number.");
        double a = sc.nextInt();
        System.out.println("Enter the valu of 4th number.");
        double s = sc.nextInt();

        double sub = (v*v)-(u*u);
        System.out.println( sub / (2*a*s));
    }
}
