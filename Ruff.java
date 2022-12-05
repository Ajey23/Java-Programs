class Student {

    String name;

}
public class Ruff {
    public static void main(String[] args){

        Student ajay = new Student();
        Student vijay = ajay;

        ajay.name = " Something something";
        System.out.println(vijay.name);
    }
}
