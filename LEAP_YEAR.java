package com.company;

import java.util.Scanner;

public class LEAP_YEAR {
    public static void main(String[] args) {

        System.out.println("Enter yar to know leap year or not");
        Scanner sc = new Scanner(System.in);
                int year= sc.nextInt();

        if ( (year%400==0) || (year%4==0 && year%100!=0) ){
            System.out.println(year+" is a leap Year.");
        }
        else
        {
            System.out.println(year+" is not a leap Year.");
        }


    }
}
