package Giris;
import java.util.Scanner;
public class ExtraYear {
    public static void main(String[] args){

        Scanner imp = new Scanner(System.in);

        int year  ;
        boolean extraYear = false;

        System.out.print("Please enter a year: ");
        year = imp.nextInt();

        /* We are makeing  an algorithm that finds out if the value you entered is Extra year or not.
        An extra year is called having 29 days in February instead of 28 every 4 years. This is because 1
        year is 365.242 days.*/

        if (year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.print("This is an extra year");
                }
                else{
                    System.out.print("This is not an extra year");
                }
            }else{
                System.out.print("This is an extra year");
            }
        }else{
            System.out.print("This is not an extra year");
        }




    }
}
