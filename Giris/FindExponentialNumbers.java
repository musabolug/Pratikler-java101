package Giris;
import java.util.Scanner;
public class FindExponentialNumbers {
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int maxValue, n;

       System.out.print("Please enter an max value :");
       maxValue = input.nextInt();

       System.out.println("Powers of 4 less than " +maxValue);
       for (n=1; n <= maxValue; n*=4){
           System.out.println(n);
       }
       System.out.println("Powers of 5 less than " +maxValue);
       for (n=1; n <= maxValue; n*=5){
           System.out.println(n);
       }
   }
}
