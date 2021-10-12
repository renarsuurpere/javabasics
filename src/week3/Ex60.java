package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (input.isEmpty()) {
                System.out.println("You typed the following words:");
                break;
            } else {
                words.add(input);
            }
        }

        Collections.sort(words);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
