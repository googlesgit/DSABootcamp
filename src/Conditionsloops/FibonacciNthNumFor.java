package src.Conditionsloops;
import java.util.Scanner;
public class FibonacciNthNumFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your nth number of fibonacci series here: ");
		int n = input.nextInt();
		
		int a=0;
		int b=1;
		for (int i=1;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println(a);
	}
}
