//Write a program to find the square of a number Code:

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num=scanner.nextDouble();

        System.out.println("The square is: "+(num * num));
    }
}
