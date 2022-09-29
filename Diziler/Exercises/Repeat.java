package Diziler.Exercises;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repititive = new int[list.length];
        int[] listMain = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i< list.length;i++ ){
            repititive[i] = 1;
        }


        for (int i = 0;i<list.length;i++){
            for (int j = 0; j< list.length;j++){
                if ((i != j) && (list[i] == list[j])){
                    repititive[i]++;

                }
            }
        }
        for (int k = 0; k < list.length;k++){
            for (int l = 0; l< list.length;l++ ){
                if ((k != l) && (list[k] == list[l])){
                    list[l] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(listMain));
        for (int i = 0 ; i< list.length;i++){
            if (repititive[i] > 1){
                if (list[i] != 0){
                    System.out.println(list[i]+" number repeated "+ repititive[i] +" times");
                }
            }
        }




    }
}
