package com.company;

import java.util.Scanner;

public class print_reverse_tring {
    public static void main(String[] args) {

        String res;
        String name = "yash";
        int n = name.length();
        System.out.println(n);

       for (int i=n-1;i>=0;i--){
           System.out.print(name.charAt(i));

       }
    }
}
