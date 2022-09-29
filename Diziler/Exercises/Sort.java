package Diziler.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter list size :");
        int size = scn.nextInt();
        int j = 1;

        int[] list = new int[size];
        for (int i = 0 ;i < list.length; i++){
            if (j<=size) {
                System.out.print(j + ". number :");
                int number = scn.nextInt();
                list[i] = number;
                j++;
            }

        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));


    }
}
