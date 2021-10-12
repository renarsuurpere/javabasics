package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of first part: ");
        int wordLength = Integer.parseInt(reader.nextLine());

        String result = word.substring(0, wordLength);

        System.out.println("Result: " + result);

    }
}
