package src.flowofprogram;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int a = num.nextInt();
		System.out.print("Enter your second number: ");
		int b = num.nextInt();	
		int sum = a + b;
		System.out.println("The sum of two numbers you have asked for is: "+ sum);
	}
}
