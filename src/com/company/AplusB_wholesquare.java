package com.company;

import java.util.Scanner;

public class AplusB_wholesquare {
    static int sre(int a , int b){

        int c= (a*a)+(2*a*b)+(b*b);
       return c;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("enter 1 no");
        a=sc.nextInt();
        System.out.println("enter 2 nd no");
        b=sc.nextInt();
        int c= sre(a,b);


        System.out.println("ans= "+c);
    }
}
