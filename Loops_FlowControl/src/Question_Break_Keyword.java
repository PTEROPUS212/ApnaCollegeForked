import java.util.*;
public class Question_Break_Keyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number :");
            int n = sc.nextInt();

            if (n % 10 == 0){
                break;
            }System.out.println(n);

        } while (true);
        System.out.println("i am out of the loop.");
    }
}

