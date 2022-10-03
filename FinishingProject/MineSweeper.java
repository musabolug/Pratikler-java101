package FinishingProject;

import Giris.While;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

  static  String[][] mapSize(int rowNumber,int colNumber){
      Random randomNumber = new Random();
      String[][] size = new String[rowNumber][colNumber];
      int low = 0;
      int highA = rowNumber;
      int HighB = colNumber;
      int mine = rowNumber* colNumber /4;
      int i = 0;

      //Plant mine
      while (i<mine){
          int randomrow = randomNumber.nextInt(highA-low) + low;
          int randomcol = randomNumber.nextInt(HighB-low) + low;
          if (size[randomrow][randomcol] != " * "){
              size[randomrow][randomcol] = " * ";
              i++;
          }
      }
      // putting - in blanks
      for (i = 0;i <rowNumber;i++){
          for (int j = 0; j < colNumber; j++){
              if (size[i][j] != " * "){
                  size[i][j] = " - ";
              }
          }
      }
      return size;
  }
  static void print(String[][] size){
      for (int i = 0; i<size.length; i++){
          for (int j = 0; j <size[i].length;j++){
              System.out.print(size[i][j]);
          }
          System.out.println();
      }
  }

   static String[][] freeSpace(int rowNumber, int colNumber){
      String[][] freeSpace = new String[rowNumber][colNumber];
      for (int i = 0; i<rowNumber;i++){
          for (int j = 0; j< colNumber; j++){
              freeSpace[i][j] = " - ";
          }
      }
      return freeSpace;
   }
   static String[][] check(String[][] size,String[][] freeSpace, int x,int y){
      int mine = x*y/4;
      int remain = (x*y)-mine;

      boolean continuation = true;

      while (continuation){
          Scanner inp = new Scanner(System.in);
          System.out.print("Please select a row :");
          int row = inp.nextInt();
          System.out.print("please select a col :");
          int col = inp.nextInt();

          if ((row < 0 || row >= x) && (col < 0 || col >= y )){
              System.out.print("You entered wrong") ;
              continue;
          }
          if (size[row][col].equals(" * ")){
              System.out.println("== Game Over! ==");
              System.out.println("== Mine Sweeper ==");
              System.out.print(size);
              continuation = false;
              break;
          } else if (size[row][col].equals(freeSpace[row][col])) {
              int count = 0;
              for (int i = -1; i<=1;i++){
               if (((row + i) < 0) || (row + i >= size.length)){
                   continue;
               }
               for (int j = -1; j <= 1;j++){
                   if (((col+j) < 0) || ( col+j >= size.length)){
                       continue;
                   }
                   if (size[row+i][col+j].equals(" * ")){
                       count++;
                   }
               }
              }
              freeSpace[row][col] = " " +count+" ";
              MineSweeper.print(freeSpace);
              remain--;
          }
          System.out.println("Remaining Space :" +remain);
          if (remain == 0){
              System.out.print("== You Win ==");
              break;
          }
      }
return size;
   }
}
