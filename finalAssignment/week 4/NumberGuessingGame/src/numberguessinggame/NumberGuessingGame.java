/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Katwalusha
 */
public class NumberGuessingGame {

    private static final String TOO_HIGH = "higher";
    private static final String TOO_LOW = "lower";
    private static final String CORRECT = "correct";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Random rand = new Random();
        int upperLimit = 20000;
        int lowerLimit = 1;
        String myAnswer;

        do {
           int randNum = (upperLimit + lowerLimit + 1) / 2;
            System.out.println("I think it's " + randNum);
            myAnswer = in.nextLine();
            
            if(!myAnswer.equals("higher") && !myAnswer.equals("lower") && !myAnswer.equals("correct") ){
                System.out.println("Keywords words are : "+ TOO_HIGH + ","+ TOO_LOW+ " and "+ CORRECT);
                
            }

            if (myAnswer.equals(TOO_LOW)) {  //too low
                lowerLimit = randNum + 1;
            } else if (myAnswer.equals(TOO_HIGH)) {
                upperLimit = randNum - 1;
            }
            
        } while (!myAnswer.equals(CORRECT));

        in.close();
        System.out.println("Sahi ho!!");
    }

}
