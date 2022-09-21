package BoxMatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.print("1-Light Weight 48-74\n"+
                "2-Middle Weight 75-80\n"+
                "3-Heavy Weight 81-120\n"+
                "Please Select Weights :\n" );
        int weight = scn.nextInt();

        System.out.print("Please enter Fighter one's name :");
        String name1 = scn.nextLine();
        name1 = scn.nextLine();
        System.out.print("Please enter Fighter one's damage :");
        int damage1 = scn.nextInt();
        System.out.print("Please enter Fighter one's health :");
        int health1 = scn.nextInt();
        System.out.print("Please enter Fighter one's weight :");
        int weight1 = scn.nextInt();
        System.out.print("Please enter Fighter one's height :");
        int height1 = scn.nextInt();

        System.out.print("Please enter Fighter two's name :");
        String name2 = scn.nextLine();
        name2 = scn.nextLine();
        System.out.print("Please enter Fighter two's damage :");
        int damage2 = scn.nextInt();
        System.out.print("Please enter Fighter two's health :");
        int health2 = scn.nextInt();
        System.out.print("Please enter Fighter two's weight :");
        int weight2 = scn.nextInt();
        System.out.print("Please enter Fighter two's height :");
        int height2 = scn.nextInt();


        Fighter goat1 = new Fighter(name1,damage1,health1,weight1,height1,50.0);
        Fighter goat2 = new Fighter(name2,damage2,health2,weight2,height2,50.0);

        Ring ring = new Ring(goat1,goat2,weight);
        ring.run();
    }
}
