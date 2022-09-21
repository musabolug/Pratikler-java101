package Giris;
import java.util.Scanner;
public class AdditionNumberDigits {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number :");
        int number = inp.nextInt();
        int result = 0;
        int basValue;
        int tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            tempNumber /= 10;
            result += basValue;
        }
            System.out.print("Result :" +result);

    }
}
