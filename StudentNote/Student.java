package StudentNote;

public class Student {
   String name;
    String stdNo;
    Course family2;
    Course  goat2;
    Course  race2;

    Course family;
    Course goat;

    Course race;
    int classes;
    double average;
    boolean isPass = false;


    Student(String name,  String stdNo,int classes,Course race, Course family, Course goat,Course race2, Course family2, Course goat2){
        this.name = name ;
        this.classes = classes;
        this.stdNo = stdNo;
        this.race = race;
        this.family = family;
        this.goat = goat;
        this.race2 = race2;
        this.family2 = family2;
        this.goat2 = goat2;
        this.average =0.0;
        this.isPass = false;
    }
    public void addExamNote(int race,int family,int goat, int race2, int family2,int goat2 ){
        if (race2 >= 0 && race2 <= 100 ){
            this.race2.note =race2;
        }
        if (family2 >= 0 && family2 <= 100 ){
            this.family2.note = family2;
        }
        if (goat2  >= 0 && goat2  <= 100 ){
            this.goat2 .note = goat2 ;

       }
          if (race >= 0 && race <= 100 ){
            this.race.note = race;
        }
        if (family >= 0 && family <= 100 ){
            this.family.note = family;
        }
        if (goat >= 0 && goat <= 100 ){
            this.goat.note = goat;

       }
    }
    public void isPass(){
        this.average = ((((this.race.note*0.80 )+ (this.family.note*0.80) + (this.goat.note*0.80))/3) +((((this.race2.note*0.20) + (this.family2.note*0.20) + (this.goat2.note*0.20))/3)));
        if(this.average> 55){
            System.out.println("==============");
            System.out.println("You are the GOAT");
            this.isPass =  true;
        }
        else{
            System.out.println("==============");
            System.out.println("You will never be a Goat");
            this.isPass = false;
        }
        //printNote();
        /*if (this.mat.note == 0 || this.physics.note == 0 || this.chemistery.note == 0){
            System.out.print("");
        }*/
    }

    void printNote(){
       // System.out.println(mat +" Note :" +mat.note);
       // System.out.println(physics +" Note :" +physics.note);
       // System.out.println(chemistery +" Note :" +chemistery.note);
        System.out.println(this.name);
        System.out.println(race.name +" Note :" +race.note);
         System.out.println(family.name +" Note :" +family.note);
         System.out.println(goat.name +" Note :" +goat.note);
         System.out.println(race2.name +"Note :" +race2.note);
        System.out.println(family2.name +"Note :" +family2.note);
        System.out.println(goat2.name +"Note :" +goat2.note);
         System.out.println("Your average :" +average);
    }


}
