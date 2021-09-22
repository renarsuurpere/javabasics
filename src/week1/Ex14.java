package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negative.");
        }

    }
}
