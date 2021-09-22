package week1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert number: ");
        int number = Integer.parseInt(reader.nextLine());

        int remainder = number % 2;

        if (remainder == 1) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
    }
}
