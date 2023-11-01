import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a :");
        float a = sc.nextFloat();
        System.out.println("Enter the number b :");
        float b = sc.nextFloat();
        System.out.println("Enter the operator you want to use :");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            default :
                System.out.println("Please enter an operator within the range.");

        }
    }

}
