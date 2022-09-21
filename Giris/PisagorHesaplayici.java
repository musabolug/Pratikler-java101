package Giris;

import java.util.Scanner;
public class PisagorHesaplayici {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int kisaKenar, uzunKenar;
        double hipotenus;

        System.out.print("Kisa Kenarin Uzunlgunu Giriniz:");
        kisaKenar = input.nextInt();
        System.out.print("Uzun Kenarin Uzunlugunu Giriniz");
        uzunKenar = input.nextInt();

        hipotenus =Math.sqrt((uzunKenar*uzunKenar) + (kisaKenar*kisaKenar));

        System.out.println("hipotenus uzunlugu :" + hipotenus);



    }
}
