package src.FirstJava;
import java.util.*;
public class CurrencyConverter {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your amount in INR : ");
        double a= input.nextDouble();
        double b= (a / 93.28);
            System.out.printf("The INR amount conversion in USD is: $ %.2f",b);
    }
}
