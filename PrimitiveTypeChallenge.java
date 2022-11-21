/* create a byte variable and set it to any valid byte number, create a short variable and set it to any
valid short number.
create an int variable and set it to any valid int number. lastly, create a variable of type long and make it
equal to 5000 plus 10 times the sum of the byte plus, short plus, integer value.
 */
public class PrimitiveTypeChallenge {

    public static void main(String[] args)
    {
        byte myByteNumber = 50;
        short myShortNumber = 90;
        int myIntNumber = 60;

        long myLongNumber = 5000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        System.out.println(myLongNumber);

    }
}
