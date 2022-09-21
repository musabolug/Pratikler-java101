package Giris;

import java.util.Scanner;

public class Fib {

    static int fib(int n){
        if (n == 1 || n == 2 ){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a N value :");
        int n = scn.nextInt();
        System.out.print(fib(n));
    }
}
