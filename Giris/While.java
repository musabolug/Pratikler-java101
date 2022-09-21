package Giris;
import java.util.Scanner;
public class While {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int password;
        boolean isPasswoerdSucces = false;

        while (!isPasswoerdSucces){
            System.out.print("Enter your password: ");
            password = inp.nextInt();
            if (password == 12345){
                System.out.println("Welcome Sir");
                isPasswoerdSucces = true;
            }else{
                System.out.println("Your password is incorrect please try again!");
            }


        }

    }

}
