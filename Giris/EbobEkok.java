package Giris;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter 1st number :");
        int firstNumber = inp.nextInt();
        System.out.print("Please enter 2nd number :");
        int secondNumber = inp.nextInt();
        int ebob = 1;

        if(firstNumber > secondNumber){
            for (int i = 1; i <= secondNumber; i++){
                if(firstNumber % i == 0 && secondNumber % i == 0){
                     ebob = i;
                }
            }
        }
        else {
            for (int i = 1; i <= firstNumber; i++){
                if(firstNumber % i == 0 && secondNumber % i == 0){
                    ebob = i;
                }
            }
        }
        System.out.println("Ebob :" +ebob);
        System.out.println("Ekok :" +((firstNumber*secondNumber) / ebob));

       /* int ekok;
        int number1,number2;

        System.out.print("please enter Ekok's first number :");
        number1 = inp.nextInt();
        System.out.print("Please enter ekok's second number :");
        number2 = inp.nextInt();
        for (int i = 1; i <= (number1*number2); i++){
                if(i % number1 == 0 && i % number2 == 0){
                    ebob = i;
                }
            }
*/





    }
}

