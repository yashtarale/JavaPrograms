package com.company;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("hey ....enter the KM to convert into Miles");
        Scanner sc = new Scanner(System.in);
        float read = sc.nextFloat();
        double conv = read*0.621371;
        System.out.println("its is "+conv+" miles" );

    }
}
