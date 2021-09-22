package week1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert points: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points <= 29) {
            System.out.println("Failed");
        } else if (points <= 34) {
            System.out.println("Grade: 1");
        } else if (points <= 39) {
            System.out.println("Grade: 2");
        } else if (points <= 44) {
            System.out.println("Grade: 3");
        } else if (points <= 49) {
            System.out.println("Grade: 4");
        } else if (points <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Insert correct points");
        }
    }
}
