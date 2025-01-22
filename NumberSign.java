//Write a program to check if a number is positive, negative, or zero.


import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println(num > 0 ? "Positive" : num<0 ? "Negative" : "Zero");
    }
}

