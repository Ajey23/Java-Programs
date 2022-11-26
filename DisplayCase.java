public class DisplayCase {

    public static void main(String[] args) {

        char Nato = 'B';
        System.out.println(" Phonetic Alphabet is " + Nato);


        switch (Nato) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
        }
    }
}
