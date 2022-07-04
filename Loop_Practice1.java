package com.company;

public class Loop_Practice1 {
    public static void main(String[] args) {

        //print even numbers between 1 and 100 both increasing and decreasing

    //increasing order

//        for (int i=1;i<=100;i++){
//            if (i%2==0)
//            {
//                System.out.println(i);
//            }
//
//        }


         //by while
//       int i=1;
//       while (i<=100){
//
//           if (i%2==0)
//           {
//               System.out.println(i);
//           }
//           i++;
//
//       }



        // decreasing order

//        for (int i=100;i>=1;i--){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }
//
//

        int i=100;
        while (i>=1){
            if (i%2==0){
                System.out.println(i); 
            }
            i--;
        }


    }
}
