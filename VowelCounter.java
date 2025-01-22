//Write a program to count the number of vowels in a given string.
public class VowelCounter {

    public static void main(String[] args) {
        String str = "hello world";
        int count = countVowels(str);
        System.out.println("Number of vowels in \"" + str + "\": " + count);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
