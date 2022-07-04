package com.company;

import java.util.Scanner;

public class welcomeName {
    public static void main(String[] args) {
        System.out.println("Hi ....whats your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day, and welcome to microsoft :) ");
    }
}
