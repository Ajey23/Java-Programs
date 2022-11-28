public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : "Not ") + "a prime number" );
        System.out.println("1 is " + (isPrime(1) ? "" : "Not ") + "a prime number" );
        System.out.println("2 is " + (isPrime(2) ? "" : "Not ") + "a prime number" );
        System.out.println("3 is " + (isPrime(3) ? "" : "Not ") + "a prime number" );
    }
    public static boolean isPrime(int WholeNumber) {

        if (WholeNumber <= 2) {
            return (WholeNumber == 2);
        }
        return true;
    }
}
