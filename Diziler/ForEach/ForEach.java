package Diziler.ForEach;

public class ForEach {
    //for ile array yapmak
    public static void main(String[] args) {
         int [] list = {1,2,3,4};

         for ( int i = 0;i< list.length; i++){
        System.out.println(list[i]);
          }


          int sum = 0;
           for (int i: list){
        sum += i;
          }
        System.out.println(sum);

        String[] cars = {"BMW", "Audi","mercedes"};
          for(String i : cars){
           System.out.println(i);
           }




    }
}
