package src.FirstJava;
import java.util.*;
public class Greetings {
	public static void main (String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter your name here: ");
		String name = input.next();
		System.out.println("Hello "+name+ ", welcome to the coding world!, you can do it with consistancy only, nothing more nothing less.");
	}
}
