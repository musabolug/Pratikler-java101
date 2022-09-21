package Giris;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.print("1. Sayiyi giriniz");
        a = inp.nextInt();
        System.out.print("2. Sayiyi giriniz");
        b = inp.nextInt();
        System.out.print("3. Sayiyi giriniz");
        c = inp.nextInt();

        if((a > b) && (a > c)){
            if(b>c){
                System.out.print("a>b>c");
            }else {
                System.out.print("a>c>b");
            }
        }else if((b>a) && (b>c)){
            if(a>c){
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
        }else if((c>a) && (c>b)){
            if(a>b){
                System.out.print("c>a>b");
            }else{
                System.out.print("c>b>a");
            }
        }

    }
}
