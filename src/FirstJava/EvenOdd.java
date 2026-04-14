package src.FirstJava;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int n = num.nextInt();
		if (n%2 ==0) {
			System.out.println(n + " is even number");
		}else {
			System.out.println(n + " is odd number");
		}
	}
}
