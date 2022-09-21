package Giris;
import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args){

        Scanner imp = new Scanner(System.in);

        int kilo;
        double indeks,boy;

        System.out.print("Boyunuzu (metre cinsinden) giriniz : ");
        boy = imp.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = imp.nextInt();

        indeks = (kilo / (boy*boy));
        System.out.print("Vucut kutle indeksiniz : "+ indeks);

    }

}
