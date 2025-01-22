import java.util.Scanner;

//Write a program to reverse the digits of a number.
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = reverse(number);

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed;
    }
}

