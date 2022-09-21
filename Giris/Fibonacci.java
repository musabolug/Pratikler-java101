package Giris;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int number1,number2, counter=1,result = 0,a=0,b=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter min value :");
        number1 = inp.nextInt();
        System.out.print("Please enter max value :");
        number2 = inp.nextInt();

        while(result<number2){
            result = a + b;
            if (result>number1 && result<number2){
                System.out.println(counter + ". fibonacci number :" +result);
            }
            counter++;
            a = b;
            b = result;
        }




    }
}
