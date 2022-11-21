public class Int {
    public static void main(String[] args)
    {
        int myMaxIntValue = Integer.MAX_VALUE;  //Integer is present in WRAPPER CLASS
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("Integer Maximum Value : " + myMaxIntValue);
        System.out.println("Integer Minimum Value : " + myMinIntValue);

        //we are adding the +1 and -1 to the Max and Min value
        System.out.println(myMaxIntValue + 1);    //Overflow condition will occur
        System.out.println(myMinIntValue - 1);    //Underflow condition will occur
    }
}
