package Giris;

import java.util.Scanner;

public class Calculator {
    static int plus(int a, int b){
        int result = a + b;
        System.out.println("result :" + result);
        return result;

    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("result :" + result);
        return result;
    }
    static int multiplication(int a, int b){
        int result = a * b;
        System.out.println("Result :" + result);
        return result;
    }
    static int divide(int a, int b){
        int result = a/b;
        if(a == 0 || b == 0){
            return 0;
        }
        System.out.println("Result :"+ result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1;i <= a;i++){
            result *= b;
        }
        return result;
    }
    static void mod(int a, int b){
        if(b > a){
            System.out.println("Please enter First number higher than second" );
        }
       else {
            int result = a % b;
            System.out.println("Result :" +result);
        }
    }
    static void rectangle(int a, int b){
           int result1 = a * b;
           int result2 = (a*2) + (b*2);
           System.out.println("Area : " + result1);
           System.out.println("Perimeter :" + result2);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1-Plus\n " +
                "2-Minus\n " +
                "3-Multiplication\n " +
                "4-Divide\n " +
                "5-Power\n " +
                "6-Mod\n " +
                "7-Rectangle Area and Perimeter Calculation\n" +
                "0-Quit");

        while(true){
            System.out.print("Please select an operation : ");
            int operation = scn.nextInt();
            if(operation>7 || operation<0){
                System.out.println("Please enter a value between 1-7");
            }
            else if(operation == 0){
                break;
            }
            else {
            System.out.print("Please enter first number :");
            int a = scn.nextInt();
            System.out.print("Please enter second number :");
            int b = scn.nextInt();

            switch(operation) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
            }
            }
        }

    }
}
