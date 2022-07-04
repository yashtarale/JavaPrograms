package com.company;

import java.util.Scanner;


public class factorial_using_method_recurtions {

    int res;
    int fact=1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ent no");
        int no = sc.nextInt();

        factorial_using_method_recurtions f = new factorial_using_method_recurtions();
        int res = f.calfact(no);
        System.out.println(res);


    }
    int calfact(int no){
            if (no>1) {
                fact = fact * no;
                calfact(no-1);
            }
        return (fact);
    }

}
