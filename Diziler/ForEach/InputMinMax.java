package Diziler.ForEach;

import java.util.Arrays;
import java.util.Scanner;

public class InputMinMax {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Please enter a number :");
        int number = scn.nextInt();


        Arrays.sort(list);
        for (int i : list){
         if (i < number){
                min =  i;

         }
         else if (i > number){
             max = i;
             break;
         }
        }


        System.out.println("First Lower number than the input : " +min );
        System.out.print("First bigger number than the input :" +max);
    }


}
