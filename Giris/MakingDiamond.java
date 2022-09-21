package Giris;

import java.util.Scanner;
public class MakingDiamond {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = inp.nextInt();

        for(int i = 1;i <= number; i++){
            for (int j = 0; j < (number-i);j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1 ); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i= 1; i <= number; i++){
            for (int j = number; j > (number - i);j-- ){
                System.out.print(" ");
            }
            for (int k = 1;k <=(2*(number-i)-1);k++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
