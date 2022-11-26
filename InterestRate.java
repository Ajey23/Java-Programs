public class InterestRate {

    public static void main(String[] args){

       for(double rate = 2.0; rate <= 5.0; rate++) {

           double interestAmount = CalculateInterest(10000.0, rate);
           System.out.println("10000.0 at " + rate + "% interest = " + interestAmount);
       }
    }
    public static double CalculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
