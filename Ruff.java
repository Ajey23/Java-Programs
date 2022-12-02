class Student {

    int rollno;
    String name;
    float marks;

    Student(int rollno, String name, float marks) {

        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
public class Ruff {
    public static void main(String[] args){

        Student Ajay = new Student(02, "ajay", 78.5f);
        System.out.println();
    }
}
