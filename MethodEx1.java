import java.sql.SQLOutput;

public class MethodEx1 {

    public static void main(String[] args) {

        CheckNumber(1);
    }
    public static void CheckNumber(int number) {

        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else if (number == 0) {
            System.out.println("Zero");
        }
    }

}
