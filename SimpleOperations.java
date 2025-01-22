//Write a program to calculate the difference, product, and division of two numbers Code:

import java.util.Scanner;

public class SimpleOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1=scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2=scanner.nextDouble();

        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        if (num2!=0) {
            System.out.println("Division: "+(num1/num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
    }
}

