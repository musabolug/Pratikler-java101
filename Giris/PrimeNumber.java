package Giris;

import java.util.Scanner;
public class PrimeNumber {
    static void power(int number){
        int result = 0, counter;
        for(int i= 1; i <= number; i++){
            for (int j=1; j<i; j++){
                if(i%j == 0){
                    result =number ;
                }

            }
        }
        if(result == number ){
            System.out.print(number + " is  a prime number");
        }
        else{
            System.out.print(number + " is  not a prime number");
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number:");
       int number = scn.nextInt();
        power(number);

    }
}
