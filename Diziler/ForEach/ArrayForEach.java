package Diziler.ForEach;

public class ArrayForEach {
    public static void main(String[] args) {
        //for ile
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        }  ;
        for (int i = 0; i < array.length; i++)  {
            for (int k = 0; k < array[i].length; k++) {
             //   System.out.print(array[i][k] + " ");
            }
        //    System.out.println();
        }
        // for each ile
        for (int[] row : array){
            for (int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
}
