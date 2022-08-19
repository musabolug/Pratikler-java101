
package Giris;

 import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args){
        // kdv %18 olarak kabul edicez
        double tutar,kdvOran = 0.18,kdvTutar,toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutariini Giriniz : ");

        tutar  = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        toplamTutar = kdvTutar + tutar;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV'li tutar :" + toplamTutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV'tutari  :" + kdvTutar);

    }
}
