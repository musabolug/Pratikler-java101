package Giris;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you want to enter: ");
        int number = scan.nextInt();
        int value;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        if(number > 1) {
            for (int i = 1; i <= number; i++) {
                System.out.print("Please enter " + i +". Number: ");
                value = scan.nextInt();
                if (min > value) min = value;
                else if (max < value) max = value;
            }

            System.out.println("Max value:" + max + "\nMin value :" + min);
        }
        else {
            System.out.println("Please enter more than 1 number ");
        }
    }


}