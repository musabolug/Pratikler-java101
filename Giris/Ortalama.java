package Giris;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, muzik, turkce, kimya, average, i = 0, top = 0;

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        if (matematik >= 0 && matematik <= 100) {
            i++;
            top += matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            i++;
            top += fizik;
        }
        if (muzik >= 0 && muzik <= 100){
            i++;
            top += muzik;
        }
        if (turkce >= 0 && turkce <= 100) {
            i++;
            top += turkce;
        }
        if (kimya >= 0 && kimya <= 100) {
            i++;
            top += kimya;
        }

        average = top / i;

        if (average > 55) {
            System.out.println("Tebrik ederiz ");
        } else {
            System.out.println("Git sanayiye basla");
        }
        System.out.print("Ortalamaniz : " + average);


    }
}



