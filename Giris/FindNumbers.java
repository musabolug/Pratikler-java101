package Giris;
import java.util.Scanner;
public class FindNumbers {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int girilenSayi,toplam = 0,adet = 0;
        double ortalama;

        System.out.print("Lutfen bir sayi giriniz : ");
        girilenSayi = inp.nextInt();

        for(int i = 0;i<=girilenSayi;i++){
            if (i%3 == 0 && i%4 == 0){
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam/(adet-1);
        System.out.print("0'dan girilen sayiya kadar olan sayilardan 3 ve 4 e tam bolunen sayilarin ortalamasi  :" +ortalama);
        inp.close();
    }
}
