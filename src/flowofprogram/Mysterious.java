package src.flowofprogram;

import java.util.Scanner;

public class Mysterious {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = num.next();   // take input as String
            
            if (input.equals("x")) {    // check for exit condition
                break;
            }
            
            int nextnum = Integer.parseInt(input); // convert to int
            sum = sum + nextnum;
        }
        
        System.out.println("The total sum is: " + sum);
    }
}