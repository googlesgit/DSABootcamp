package src.FirstJava;
import java.util.*;
public class GreaterNumber {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number here: ");
        int a= input.nextInt();
        System.out.print("Enter your second number here: ");
        int b= input.nextInt();
        if (a>b){
            System.out.println(a+" is greater than "+b);
        }else {
            System.out.println(b+" is greater than "+a);
        }
    }
}
