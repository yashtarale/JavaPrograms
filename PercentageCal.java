package com.company;

import java.util.Scanner;

public class PercentageCal {
    public static void main(String[] args) {
        System.out.println("welcome to percentage monitoring program");
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the marks of subject 1");
        float a = sc.nextInt();

        System.out.println("please enter the marks of subject 2");
        float b = sc.nextInt();

        System.out.println("please enter the marks of subject 3");
        float c = sc.nextInt();

        System.out.println("please enter the marks of subject 4");
        float d = sc.nextInt();

        System.out.println("please enter the marks of subject 5");
        float e = sc.nextInt();

        float sum = a+b+c+d+e;
        float yas = (sum/500)*100;
        System.out.print("Your percentage are : "+yas);





    }
}
