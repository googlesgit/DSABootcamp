package src.flowofprogram;
import java.util.*;
public class Hcf {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int a = num.nextInt();
		System.out.print("Enter your second number: ");
		int b = num.nextInt();	
		int tempA =a;
		int tempB =b;
		while (tempB!=0) {
			int reminder = tempA % tempB;
			tempA = tempB;
			tempB = reminder;
		}
		int hcfNum = tempA;
		int lcmNum = (a *b)/hcfNum;
		System.out.println("Lcm is: "+ lcmNum + " and hcf is: "+ hcfNum);
	}
}
