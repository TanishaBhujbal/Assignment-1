//Write a program to check if a number is even or odd.

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println(num % 2== 0 ? "Even" : "Odd");
    }
}

