package Giris;
import java.util.Scanner;
public class Kasa {
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double toplamTutar,armutMiktari,elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari;
        double armutFiyati,elmaFiyati,domatesFiyati,muzFiyati,patlicanFiyati;

        System.out.print("Armut Kac Kilo :");
        armutMiktari = imp.nextDouble();
        System.out.print("Elma Kac kilo :");
        elmaMiktari = imp.nextDouble();
        System.out.print("Domates kac kilo");
        domatesMiktari = imp.nextDouble();
        System.out.print("Muz kac kilo :");
        muzMiktari = imp.nextDouble();
        System.out.print("Patlican kac kilo :");
        patlicanMiktari = imp.nextDouble();

        armutFiyati = (armut*armutMiktari);
        elmaFiyati = (elma*elmaMiktari);
        domatesFiyati =(domates*domatesMiktari);
        muzFiyati = (muz*muzMiktari);
        patlicanFiyati = (patlican*patlicanMiktari);

        toplamTutar = (armutFiyati+elmaFiyati+domatesFiyati+muzFiyati+patlicanFiyati);
        System.out.print("toplam Tutar :" +toplamTutar);

    }


}
