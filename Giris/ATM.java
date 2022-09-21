package Giris;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String userName, password;
        int transaction,price,depositPrice;
        int right = 3;
        int balance = 2000;

        while (right > 0){
            System.out.print("Please enter your username :");
            userName = scn.nextLine();
            System.out.print("Please enter your password :");
            password = scn.nextLine();

                if (userName.equals("musabolug")&&password.equals("Mm103742")){
                              System.out.println("You are logged in Welcome!");
                              do{
                                  System.out.println("1-  withdraw cash\n " +
                                          "2- Check balance\n" +
                                          "3- cash deposit\n" +
                                          "4 - exit\n");
                                  System.out.print("please select your transaction :");
                                  transaction = scn.nextInt();
                                  switch (transaction){
                                      case 1:
                                        System.out.print("Please enter price :");
                                        price = scn.nextInt();
                                        if (price > balance){
                                            System.out.println("Your balance is not enough");
                                        }else{
                                            balance -=price;
                                            System.out.println("Your new balance :" +balance);
                                        }break;

                                      case 2:
                                          System.out.println("Your balance :" +balance);
                                          break;

                                      case 3:
                                          System.out.print("Please enter deposit price :");
                                          depositPrice = scn.nextInt();
                                          balance += depositPrice;
                                          System.out.println("Your new balance :" +balance);
                                          break;
                                      default:System.out.println("Please enter between 1-4");
                                  }
                              }
                              while (transaction!=4);
                              System.out.print("See you later");
                              break;
                }
                else {
                        System.out.println("Your username or password is wrong");
                        right--;
                        System.out.println("Your right :" + right);
                    if (right == 0) {
                        System.out.println("Your access right has expired and your card is blocked.");
                    }


                    }
                }
        }

    }

