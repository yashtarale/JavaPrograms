package com.company;
import java.util.Scanner;

public class table2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter t");

        int i=0;
            System.out.println("enter");

            int a = in.nextInt();        System.out.println("enter");

            int b = in.nextInt();        System.out.println("enter");

            int n = in.nextInt();


            for (int j=0;j<n;j++){
                a = a+(int)Math.pow(2,j)*b;
                System.out.print(a+" ");
            }
            System.out.println();



    }
}
