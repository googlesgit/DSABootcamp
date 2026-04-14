package src.flowofprogram;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the year: ");
            int year = input.nextInt();
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
                
            }
        }
    }
}
