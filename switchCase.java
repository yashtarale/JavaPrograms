package com.company;

import java.util.Scanner;

public class   switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number u wanna compare");
        int age = sc.nextInt();


//        switch (age){
//            case 18:
//                System.out.println("u are note teen now");
//                break;
//
//            case 16:
//                System.out.println("u are teen now");
//                break;
//            case 21:
//                System.out.println("u are in college now");
//                break;
//
//            default:
//                System.out.println("thanks for using doesn't match here");
//        }

        //enhances switch wala case

        switch (age) {
            case 18 -> System.out.println("u are note teen now");
            case 16 -> System.out.println("u are teen now");
            case 21 -> System.out.println("u are in college now");
            default -> System.out.println("thanks for using doesn't match here");
        }
    }
}
