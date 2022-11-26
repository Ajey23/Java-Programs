public class DisplayNumber {

    public static void main(String[] args){

        PrintNumberInWord(2);
    }
    public static int PrintNumberInWord(int num) {

        if(num == 0){
            System.out.println("Zero");
        }
        else if(num == 1){
            System.out.println("One");
        }
        else if(num == 2){
            System.out.println("Two");
        }
        else if(num == 3){
            System.out.println("Three");
        }
        else if(num == 4){
            System.out.println("Four");
        }
        else if(num == 5){
            System.out.println("Five");
        }

        switch (num){
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
        return 0;
    }
}
