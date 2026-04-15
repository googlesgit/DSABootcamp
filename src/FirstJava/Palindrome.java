package src.FirstJava;
import java.util.*;
public class Palindrome {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your word here to check if it is palindrom or not :  ");
        String s1 = input.next();
        String s2="";
        for (int i=0; i<s1.length(); i++){
            s2=s1.charAt(i)+s2;
        }
        System.out.println("the reversed string is: "+s2);
        if (s1.equals(s2)){
            System.out.println("Yes the word is a palindrom");
        }else {
            System.out.println("No the word is not a palindrom");
        }
        
    }
}
