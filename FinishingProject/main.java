package FinishingProject;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Row Number :");
        int rowNumber = inp.nextInt();
        System.out.print("Col number :");
        int colNumber = inp.nextInt();
        String[][] size =MineSweeper.mapSize(rowNumber,colNumber);
        String[][] freeSpace =MineSweeper.freeSpace(rowNumber,colNumber);
        MineSweeper.print(freeSpace);

        MineSweeper.check(size,freeSpace,rowNumber,colNumber);
        System.out.println();
        MineSweeper.print(size);
    }
}
