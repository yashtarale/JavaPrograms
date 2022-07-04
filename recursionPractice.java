package com.company;

import org.w3c.dom.ls.LSOutput;

public class recursionPractice {
    public static void main(String[] args) {
        int result= sum(5,10);
        System.out.println(result);
    }
//10>5....10+9+8+7+6+5
    public static int sum(int start,int end){
        if (end>start){
            return end+sum(start,end-1);
        }
        else{
            return end;
        }
    }
}
