package StudentNote;

public class Teacher {
    String name;
    String no;
    String branch;

    Teacher(String name, String mpNo, String branch){
        this.name = name;
        this.no = mpNo;
        this.branch = branch;
    }
    void Print(){
        System.out.println("Name :" + this.name);
        System.out.println("No :" +this.no);
        System.out.println("Branch :" + this.branch);
    }
}
