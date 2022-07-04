package com.company;

import java.util.Scanner;

public class FIbonacci_series {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number upto which u have to pr9int fibonacci series");
        int upto = sc.nextInt();

        int a=0,b=1,c=0;
        System.out.print("ans = ");
        System.out.print(a+" _ "+b+" _ ");
        for (int i=1;i<=upto;i++) {

            c = a + b;
            System.out.print(" "+c+" _ ");
            a = b;
            b = c;
        }
    }
}
