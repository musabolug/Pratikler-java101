package Giris;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        double indirimli_tutar,gidis_donus_indirimi;
        int mesafe;
        int yas;
        int yolculuk_tipi;
        double normal_tutar,yas_indirim_orani,yolculuk_tipi_indirimi,yas_inidirimi,toplam_tutar;


        System.out.print("Mesafeyi km turunden giriniz: ");
        mesafe = imp.nextInt();
        System.out.print("Yasinizi giriniz");
        yas = imp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek yon / 2 => Gidis gelis)");
        yolculuk_tipi = imp.nextInt();


        if(yolculuk_tipi== 1){
            yolculuk_tipi_indirimi = 0;
        }else{
            yolculuk_tipi_indirimi =0.20;
        }
        

        if(yas>0 && yas<12){
            yas_indirim_orani = 0.50;
        } else if (yas>11 && yas<25) {
            yas_indirim_orani = 0.10;
        }else{
            yas_indirim_orani = 0.30;
        }


        normal_tutar = mesafe*0.10;
        yas_inidirimi = normal_tutar * yas_indirim_orani;
        indirimli_tutar = normal_tutar - yas_inidirimi;
        gidis_donus_indirimi= normal_tutar * yolculuk_tipi_indirimi;
        toplam_tutar = indirimli_tutar-gidis_donus_indirimi;
        System.out.print("Toplam tutar: " +toplam_tutar);




    }

 
}
