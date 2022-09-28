package Diziler.Exercises;

public class RepetitiveNumber {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] list = {3,2,1,5,7,9,3,6,9,2,4,6,4,9,2};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i< list.length; i++){
            for (int j = 0; j< list.length; j++){
                if ((i != j) && (list[i] == list[j])){
                if(!isFind(dublicate, list[i])){
                    if (list[i] % 2 == 0) {
                        dublicate[startIndex++] = list[i];
                    }
                }
                break;
                }
            }
        }
        for ( int value : dublicate){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
    }
}
