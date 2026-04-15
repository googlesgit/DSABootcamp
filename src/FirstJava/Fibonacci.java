package src.FirstJava;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter a number to print fibonacci series: ");
        int n = input.nextInt();
        while(a<=n){
            System.out.print(a+" ");
            int c= a+b;
            a=b;
            b=c;
        }
    }
}
