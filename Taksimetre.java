package Giris;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        /*
        Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner input = new Scanner(System.in);
        double kmbasinaUcret = 2.20,ucret;
        int acilisTutari = 10, minTutar = 20, gidilenKm;

        System.out.print("Gidilen Km miktarini giriniz :");
        gidilenKm = input.nextInt();

        ucret = (acilisTutari+(kmbasinaUcret*gidilenKm));
        ucret = (ucret < 20 ) ? 20 : ucret;

        System.out.print("Odemeniz gereken tutar :" +ucret);

    }
}
