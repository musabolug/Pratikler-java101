package Giris;

import java.util.Scanner;

public class Odevler {
    public static void main(String[] args) {

        int muzik, mat, ing, turkce, fizik, kimya;

        Scanner input = new Scanner(System.in);

        System.out.print("Muzik Notunuzu Giriniz");
        muzik = input.nextInt();

        System.out.print("Matematik Notunuzu Giriniz");
        mat = input.nextInt();

        System.out.print("Ingilizce Notunuzu Giriniz");
        ing = input.nextInt();

        System.out.print("Turkce Notunuzu Giriniz");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz");
        kimya = input.nextInt();

        int toplam = (muzik + mat + ing + turkce + fizik + kimya);
        double ortalama = toplam / 6.0;
        System.out.println(ortalama);
        int baraj = 60;
        boolean belge = ortalama >= 60;
        String GectiMi = belge ? "Sinifi gecti" : "Sinfta Kaldi";
        System.out.print(GectiMi);



    }
}
