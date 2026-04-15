package src.FirstJava;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name here: ");
		String name = input.next();
		System.out.print("Hey "+name+ ", please enter your principle amount here lets caluculate simple interest here: ");
		double p = input.nextDouble();
		System.out.print("now enter time in months here: ");
		int t = input.nextInt();
		System.out.print("now enter rate of interest here: ");
		double r =input.nextDouble();
		double i = (p*t*r)/100;
		System.out.printf("This is your simple interest: %.2f" , i);
		}
	
}
