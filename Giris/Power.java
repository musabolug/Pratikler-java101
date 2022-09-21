package Giris;
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number,power;
        int total = 1;
        System.out.print("Please enter a number :");
        number = inp.nextInt();
        System.out.print("Please enter a power :");
        power = inp.nextInt();

        for (int i =1;i <= power; i++){
            total *= number;
        }
        System.out.print("Result :" +total);

    }

}
