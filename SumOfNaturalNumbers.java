//Write a program to calculate the sum of the first n natural numbers.

import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = scanner.nextInt();
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        int sum2 = (n * (n + 1)) / 2;

        System.out.println("Sum of first " + n + " natural numbers (using loop): " + sum1);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + sum2);

        scanner.close();
    }
}

