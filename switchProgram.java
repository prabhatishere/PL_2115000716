package PL_2115000716.PL_2115000716;
import java.util.*;

public class switchProgram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to sub");
        System.out.println("Enter 3 to mul");
        System.out.println("Enter 4 to div");
        int n = sc.nextInt();
        switch(n){
            case 1: System.out.println("The Addition is "+num1+num2);
                break;
            case 2: System.out.println("The Subtraction is "+(num1-num2));
                break;
            case 3: System.out.println("The Multiplication is "+num1*num2);
                break;
            case 4: System.out.println("The Division is "+num1/num2);
                break;
            default : System.out.println("Enter number in the range of 1 to 4");
                break;
        }
        sc.next();
    }
}