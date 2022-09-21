package Giris;
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a value :");
        int value = scn.nextInt();
        for (int i =1;i <= value; i++){
            for (int j = value; j > (value - i);j-- ){
                System.out.print(" ");
            }
            for (int k = 1;k <=(2*(value-i)-1);k++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }
    }

