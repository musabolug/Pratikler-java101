package Giris;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int number = inp.nextInt();
        int result = 0;

        for (int i = 1; i< number;i++){
            if(number%i == 0){
                result += i;
            }
        }
        if(result == number){
            System.out.print(number + " is a perfect number ");
        }
        else {
            System.out.print(number + " is not a perfect number");
        }

    }
}
