package src.Conditionsloops;

import java.util.Scanner;

public class FrequencyCounter {
	/*
	 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
	 * System.out.println("Enter your number here: "); int n = in.nextInt();
	 * System.out.println("Enter single number to check its frequency: "); int x=
	 * in.nextInt();
	 * 
	 * int count=0; while(n>0) { int temp= n%10; if(temp==x) count++; n=n/10; }
	 * System.out.println(count); }
	 */	
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter your number here: ");
		String s = in.next();
		System.out.print("Enter single number to check its frequency: ");
		String x =in.next();
		int count=0;
		char target = x.charAt(0);
		 for(int i =0; i< s.length(); i++){
	          char ch  = s.charAt(i);
	          if(ch == target) count++;
	      }
	       
	       System.out.println("Count "+ count);
		
		
		}
}

