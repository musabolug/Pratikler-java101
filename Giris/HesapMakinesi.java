package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("Ilk  sayiyi giriniz");
        n1 = imp.nextInt();
        System.out.print("Ikinci sayiyi giriniz");
        n2 = imp.nextInt();

        System.out.println("1-Toplama\n2-cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciniz : ");
        select = imp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam :" + (n1 + n2));
                break;
            case 2 :
                System.out.print("Cikarma :" +(n1 - n2));
                break;
            case 3 :
                System.out.print("Carpma :" +(n1 * n2));
                break;
            case 4 :
                    if(n2 != 0){
                        System.out.print("Bolme :" +(n1 / n2));
                    }
                    else{
                        System.out.print("0'a bolunmez");
                    }
                break;
            default :
                System.out.print("Yanlis Secim Yaptiniz. Lutfen 1 ile 4 arasinda bir secim yapin");

        }
    }
}
