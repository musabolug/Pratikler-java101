package StudentNote;

public class Course {
    Teacher teacher = null;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else{
            System.out.print("Teacher and the Course doesn't match");
        }

    }

     void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
