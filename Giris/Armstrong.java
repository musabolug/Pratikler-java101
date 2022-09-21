package Giris;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number :");
        int number = inp.nextInt();
        int basNumber = 0;
        int basPow;
        int result = 0;
        int basValue;
        int tempNumber = number;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++ ){
                basPow *= basValue;
            }
            result  += basPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.print(result + " is an Armstrong number");
        }
        else{
            System.out.print(result +" is not an Armstrong number");
        }
    }
}
