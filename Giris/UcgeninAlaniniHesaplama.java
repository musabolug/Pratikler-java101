package Giris;
import java.util.Scanner;
public class UcgeninAlaniniHesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int ilkKenar,ikinciKenar,ucuncuKenar,cevre,u;
        double alan;

        System.out.print("1. Kenari giriniz :");
        ilkKenar = input.nextInt();
        System.out.print("2. Kenari giriniz :");
        ikinciKenar = input.nextInt();
        System.out.print("3. Kenari giriniz :");
        ucuncuKenar = input.nextInt();

        cevre = (ilkKenar+ikinciKenar+ucuncuKenar);
        u = cevre/2;
        alan = Math.sqrt(u*(u-ikinciKenar)*(u-ilkKenar)*(u-ucuncuKenar));

        System.out.println("Ucgenin alani :"+ alan);
        System.out.print("Ucgenin cevresi :"+ cevre);

    }
}
