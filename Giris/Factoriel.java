package Giris;
import java.util.Scanner;
public class Factoriel {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int n,r;
        int total = 1;

        System.out.print("Please enter n's value :");
        n = inp.nextInt();
        System.out.print("Please enter r's value");
        r = inp.nextInt();

        while (true){
            if (r>n){
                System.out.print("Please enter r's value less than n's value");
                break;
            }
            int sayac = 1;
            int sayac2 = 1;
            int sayac3 = 1;

            for (int i = 1; i <= n; i++){
                sayac = sayac * i;
             }
            for (int j = 1; j <= r; j++){
                sayac2 = sayac2 * j;
            }
            for (int k = 1; k <= (n-r); k++){
                sayac3 = sayac3 * k;
            }


            int combination = sayac/(sayac2*sayac3);
            System.out.print("Result: " +combination);
            break;


        }

    }
}
