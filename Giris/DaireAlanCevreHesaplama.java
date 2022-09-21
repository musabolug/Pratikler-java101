package Giris;
import java.util.Scanner;
public class DaireAlanCevreHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            double pi = 3.14, alan, cevre,a;
            int r;

            System.out.print("Yaricap giriniz :");
            r = input.nextInt();
            System.out.print("merkez acisinin degerini giriniz :");
            a = input.nextDouble();

            alan = (pi*(r*r)*a)/360;
            cevre =((pi*r)+(pi*r));


            System.out.println("Alan:" +alan);
            System.out.print("Cevre:" +cevre);



    }
}
