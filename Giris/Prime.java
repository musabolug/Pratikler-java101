package Giris;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            System.out.print("Please enter a max value :");
            int max = scn.nextInt();
            int counter ,counter2=0;

            for (int i = 1; i<= max;i++ ){
                counter = 0;
               for (int j = 1; j < i; j++){
                   if (i%j == 0)counter++;
                   counter2++;
                }
               if (counter == 1) System.out.print(i + " ");

            }



    }
}
