package src.Conditionsloops;
import java.util.Scanner;
public class FibonacciNthNumWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your nth number of fibonacci series here: ");
		int n = input.nextInt();
		
		int a=0;
		int b=1;
		
		int i =1;
		while(i<=n) {
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}
}
