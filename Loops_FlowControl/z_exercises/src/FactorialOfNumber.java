import java.util.*;

public class FactorialOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        long n = sc.nextInt();
        long factorial = 1;
        for (long i =1; i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
