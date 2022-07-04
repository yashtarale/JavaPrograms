package com.company;

import java.util.Scanner;

public class Fibonacci_BY_RECURSION {

     static int a=0,b=1,c;
                 public static void main(String[] args)
                 {
                     System.out.print(a+" "+b+" ");
                     Fibonacci_BY_RECURSION f = new Fibonacci_BY_RECURSION();
                     f.printFib(10);


                 }
                 void printFib(int i) {

                     if (i>1){
                         c=a+b;
                         System.out.print(c+" ");
                         a=b;
                         b=c;
                         printFib(i-1);

                 }



    }

}
