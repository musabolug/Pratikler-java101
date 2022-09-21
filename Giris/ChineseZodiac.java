package Giris;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);

        int year,animal;

        System.out.print("Type your birth year plese: ");
        year = imp.nextInt();

        switch (year%12){
            case 0: System.out.print("Your Chinese Zodiac is Monkey");
                break;
            case 1: System.out.print("Your Chinese Zodiac is Cock");
                break;
            case 2: System.out.print("Your Chinese Zodiac is Dog");
                break;
            case 3: System.out.print("Your Chinese Zodiac is Pig");
                break;
            case 4: System.out.print("Your Chinese Zodiac is Mause");
                break;
            case 5: System.out.print("Your Chinese Zodiac is ox");
                break;
            case 6: System.out.print("Your Chinese Zodiac is Tiger");
                break;
            case 7: System.out.print("Your Chinese Zodiac is Rabbit");
                break;
            case 8: System.out.print("Your Chinese Zodiac is Dragon");
                break;
            case 9: System.out.print("Your Chinese Zodiac is Snake");
                break;
            case 10: System.out.print("Your Chinese Zodiac is Horse");
                break;
            case 11: System.out.print("Your Chinese Zodiac is Sheep");
                break;
        }
    }
}
