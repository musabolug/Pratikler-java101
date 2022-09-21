package Giris;
import java.util.Scanner;
public class SicaklikOlcme {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sicaklik degeri giriniz : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz ");
        }else if( heat <= 25){
            if(heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz");
            if(heat >=10 ){
                System.out.print("Piknik yapabilirsiniz");
            }
        }
        }
        else{
            System.out.println("Yuzmeye gidebilirsiniz");
        }



    }
}
