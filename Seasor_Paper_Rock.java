package com.company;

import java.util.Random;
import java.util.Scanner;

public class Seasor_Paper_Rock {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";


    public static void main(String[] args) {

//        int [] intarray = {1,2,3};
//        int idx = new Random().nextInt(intarray.length);
//        String random = "value is "+(intarray[idx]);

//        System.out.println(random);


                System.out.println("Enter any one of the following inputs:  ");
                System.out.println("ROCK");
                System.out.println("PAPER");
                System.out.println("SCISSORS");
                System.out.println();

                String playerMove = getPlayerMove();
                String computerMove = getComputerMove();

                //Rules of the Seasor_Paper_Rock Applied Below:
      /*if both playerMove and computerMove
        produces the same formation, then
        Seasor_Paper_Rock is a tie*/
                if (playerMove.equals(computerMove))
                    System.out.println("Seasor_Paper_Rock is Tie !!");
                    // if playerMove is ROCK
                else if (playerMove.equals(Seasor_Paper_Rock.ROCK))
                    System.out.println(computerMove.equals(Seasor_Paper_Rock.PAPER) ? "Computer Wins": "Player wins");
                    // if playerMove is PAPER
                else if (playerMove.equals(Seasor_Paper_Rock.PAPER))
                    System.out.println(computerMove.equals(Seasor_Paper_Rock.SCISSORS) ? "Computer Wins": "Player wins");
                    // if playerMove is SCISSORS
                else
                    System.out.println(computerMove.equals(Seasor_Paper_Rock.ROCK) ? "Computer Wins": "Player wins");
            }

            /* Get Computer's move using Random
               class nextInt() method */
            public static String getComputerMove()
            {
                String computermove;
                Random random = new Random();
                int input = random.nextInt(3)+1;
                if (input == 1)
                    computermove = Seasor_Paper_Rock.ROCK;
                else if(input == 2)
                    computermove = Seasor_Paper_Rock.PAPER;
                else
                    computermove = Seasor_Paper_Rock.SCISSORS;

                System.out.println("Computer move is: " + computermove);
                System.out.println();
                return computermove;
            }

            /* Get Player's move using Scanner
               class */
            public static String getPlayerMove()
            {
                Scanner in = new Scanner(System.in);
                String input = in.next();
                String playermove = input.toUpperCase();
                System.out.println("Player move is: "+ playermove);
                return playermove;
            }


    }

