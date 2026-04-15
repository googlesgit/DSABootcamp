package src.FirstJava;
import java.util.*;
public class UserInput {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number here: ");
        int a= input.nextInt();
        System.out.print("Enter your second number here: ");
        int b= input.nextInt();
        System.out.print("Enter your operation to do here (select from +,-,*,/) here: ");
        String c= input.next();
        if (c.equals("+")){
            System.out.println("Your operation answer is: "+(a+b));
        }else if (c.equals("-")){
            System.out.println("Your operation answer is: "+(a-b));
        }else if (c.equals("*")){
            System.out.println("Your operation answer is: "+(a*b));
        }else if (c.equals("/")){
            System.out.println("Your operation answer is: "+(a/b));
        }else{
            System.out.println("Enter the right operator or numbers");
        }
    }
}
