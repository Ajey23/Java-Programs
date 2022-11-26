public class SwitchStatement {

    public static void main(String[] args) {

        int SwitchValue = 3;

        switch (SwitchValue)  {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                    System.out.println("Value was 3, 4, 5");
                System.out.println("Actually it was a " + SwitchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
        }
    }
}
