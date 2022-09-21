package Giris;
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a bumber :");
        int number = inp.nextInt();
        double result = 0.0;

        for(double i = 1; i <= number; i++){
                result += (1/i);
        }

        System.out.print(result);


    }
}
