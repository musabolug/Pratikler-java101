package Diziler.Exercises;

import Giris.While;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        // or you can do like this : int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while(right<5){
            System.out.print("Please enter your guess :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please enter a value between 0 - 100 ");
                if (isWrong){
                    right++;
                    System.out.println("You enter the value wrong. You have "+ (5-right) +" guesses left");
                }
                else {
                    isWrong = true;
                    System.out.println("If you enter wrong value again, your rights will be reduced");
                }
                continue;
            }
            if(selected == number){
                System.out.println("Congratulations, you got it right");
                System.out.println("Your Guess is :" +number);
                isWin = true;
                break;
            }
            else{
                System.out.println("You guessed wrong ");
                if (selected>number){
                    System.out.println("The number is lower than "+selected);
                }else {
                    System.out.println("The number is bigger than "+selected);
                }
                wrong[right++] = selected;
                System.out.println("Your remaining right : "+ (5-right));
            }
        }
        if (!isWin){
            System.out.println("==============");
            System.out.println("You Lost!");
            System.out.println("The number was :"+number);
            if (!isWrong){
                System.out.println("Your guesses are : "+ Arrays.toString(wrong));
            }
        }

    }
}
