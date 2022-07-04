package com.company;

import java.util.Scanner;

public class DetectIntegerOrNot {
    public static void main(String[] args) {
        System.out.println("ent no. which u want to check");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
