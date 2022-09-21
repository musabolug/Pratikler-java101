package Giris;

import java.util.Scanner;

    public class PalindormNumber {

    static boolean isPalindorm(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while(temp != 0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber * 10)+lastNumber;
            temp/=10;
        }

            if(reverseNumber==number){
                return true;
            }
            else {
                return false;
            }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a Number :");
        int number = scn.nextInt();
       if (isPalindorm(number)== true){
           System.out.print(number + " is a Palindorm number.");
       }
       else{
           System.out.print(number + " is not a palindorm number");
       }

    }
}
