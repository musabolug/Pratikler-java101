package Methods;

import java.util.Scanner;



public class Method {

    static void decreaseIncreaseBy5(int number) {
        System.out.print(number + " ");
        if (number <= 0) return;
        decreaseIncreaseBy5(number - 5);
        System.out.print(number + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int sayi = input.nextInt();
        decreaseIncreaseBy5(sayi);
    }
}

