package week2;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    private static int drawNumber() {
        return new Random().nextInt(101);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;

        while(true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            count++;

            if (numberDrawn > guess) {
                System.out.println("The number is greater, guesses made: " + count);

            }   else if (numberDrawn < guess) {
                System.out.println("The number is lesser, guesses made: " + count);

            }   else {

                break;
            }

        }
        System.out.println("Congratulations, your guess is correct!");
    }
}
