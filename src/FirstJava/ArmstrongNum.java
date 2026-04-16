package src.FirstJava;
import java.util.*;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your starting number: ");
		int start = input.nextInt();
		System.out.print("enter your ending number: ");
		int end = input.nextInt();
		
		for (int i=start+1;i<=end-1;i++) {
			int result = powersSum(i);
			if (i==result) {
				System.out.println("Armstrong number: "+i);
			}
		}
		input.close();
	}
	
	
	public static int powersSum(int num) {
		int powersum=0;
		int count= countofDigits(num);
		
		while(num>0) {
			int temp=num%10;
			powersum = powersum+ (int) Math.pow(temp, count);
			num = num /10;
		}
		return powersum;
	}
	
	public static int countofDigits(int num) {
		int count=0;
		while (num>0) {
			num = num/10;
			count = count+1;
		}
		return count;
	}
	
	
	
}
