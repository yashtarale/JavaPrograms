package com.company;

import java.util.Scanner;

public class numberGreaterOrNot {
    public static void main(String[] args) {
        int given=10;
        System.out.println("Enter the number u wanna compare");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        if(a<given)
        {
            System.out.println("entered number is smaller than given number");
        }
        else if(a==given) {

            System.out.println("number is equal ");
        }
        else {
            System.out.println("entered number is greater than the given number");
        }
    }

}
