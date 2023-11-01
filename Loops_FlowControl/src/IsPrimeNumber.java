import java.util.*;
public class IsPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is a prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                    System.out.println("n is prime.");
            } else {
                System.out.println("n is not prime.");
            }
        }

    }
}