package Giris;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);
        String username, password,newPassword,secim;

        System.out.print("Kullanici adinizi giriniz");
        username = imp.nextLine();

        System.out.print("Parolayi soyle");
        password = imp.nextLine();

        if(username.equals("Saban") && password.equals("Safak")){
            System.out.print("Gecebilirsiniz");
        }else {
            System.out.println("Parola yanlis! Parolayi sifirlamak ister misiniz?");
            System.out.println("Evet/Hayir");
            System.out.print("Seciniz :");
            secim = imp.nextLine();

            if (secim.equals("Evet")) {
                System.out.print("yeni sifreyi giriniz :");
                newPassword = imp.nextLine();

                if (newPassword.equals("Safak") || newPassword.equals(password)) {
                    System.out.print("Sifre olusturulamadi. Lutfen baska sifre giriniz. ");
                    newPassword = imp.nextLine();
                    System.out.print("Sifre Olusturuldu");

                } else {
                    System.out.print("Sifre Olusturuldu");
                }
            }
            else {
                System.out.print("Sonra Gorusuruz");
            }

        }
        }

        }