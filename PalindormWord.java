package Diziler.Exercises;

import java.util.Scanner;

public class PalindormWord {
    //way 1
    static boolean isPalindorm(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //way 2
    static boolean isPalindorm2(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a Word :");
        String str = scn.nextLine();
        System.out.println(isPalindorm(str));
    }
}
