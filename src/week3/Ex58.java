package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (words.contains(input)) {
                System.out.println("You gave the word " + input + " twice");
                break;
            } else {
                words.add(input);
            }
        }
    }
}
