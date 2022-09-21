package StudentNote;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sebastian Vettel", "5", "Family");
        Teacher t2 = new Teacher("Fernando alonso", "14", "Race");
        Teacher t3 = new Teacher("Michael Schumacher", "47", "Goat");



        Course family = new Course("Family", "101","Family");
        Course race = new Course("Race", "101" , "Race");
        Course goat = new Course("Goat", "101","Goat");
        Course goat2 = new Course("Goat2", "101","Goat2");
        Course family2 = new Course("Family2", "101","Family2");
        Course race2 = new Course("Race2", "101","Race2");


        family.addTeacher(t1);
        race.addTeacher(t2);
        goat.addTeacher(t3);



        Student s1 = new Student("Max Verstappen","1",3,race,family,goat,race2,family2,goat2);
        s1.addExamNote(60,45,0,90,50,35);
        s1.isPass();
        s1.printNote();


        Student s2 = new Student("Lewis Hemilton", "44",3,race,family,goat,race2,family2,goat2);
        s2.addExamNote(90,50,80,90,60,90);
        s2.isPass();
        s2.printNote();

    }
}
