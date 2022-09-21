package Methods;

import java.util.Scanner;

public class PowerMethods {

    static void power(int base,int power){
        long result= 1;
        for (int i = 1;i <= power;i++ ){
            result *= base;

        }
        System.out.println("Result :" +result);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter a base number :");
        int base = scn.nextInt();
        System.out.print("Please enter a Power :");
        int power = scn.nextInt();
        power(base,power);
    }
}
