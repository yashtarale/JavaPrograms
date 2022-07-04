package com.company;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no= sc.nextInt(); //121 consider as example
        int temp=no;  //121 saved
        int rev=0,rem;  // 2 var taken

        while (temp!=0) //check for loops by temp=temp/10
        {

            rem=temp%10;    // rem = 121%10 ===== 12.1 ====by int 12
            rev=rev*10+rem;
            temp=temp/10;

        }
        if (no==rev){
            System.out.println(no+" is a palindrome number");

        }
        else {
            System.out.println(no+" is not a palindrome number");
        }

    }
}
