package com.company;

import java.util.Scanner;

public class TYPE_OF_WEBSITE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the website name");
        String website= sc.next();

        if(website.endsWith(".org")){

            System.out.println("Your website is is organizational website");

        }
        else if (website.endsWith(".in")){

            System.out.println("website is indian website");
        }
        else if (website.endsWith(".com"));
        {
            System.out.println("website is commercial");

        }


    }
}
