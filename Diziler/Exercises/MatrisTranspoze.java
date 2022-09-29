package Diziler.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a lenght :");
        int length = inp.nextInt();
        System.out.print("Please enter a Height :");
        int height = inp.nextInt();
        System.out.println("Please enter Matris's numbers :");

        int[][] matrix = new int[length][height];

        for (int i = 0; i< length;i++ ){
            for (int j = 0; j < height; j++){
                System.out.print((i + 1) + ". satir - " + (j + 1) + ". sutun : ");
                matrix[i][j]= inp.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Matris :");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("\t" + matrix[j][i]);
            }
            System.out.print("\n");
        }
    }
}
