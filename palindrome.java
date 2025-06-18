import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        String reverse ="";

        System.out.print("GELI ERAY AMA TIRO: ");
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " PALINDROM WEEYE.");
        } else {
            System.out.println(word + " PALINDROME MAHAA.");
        }


    }
}