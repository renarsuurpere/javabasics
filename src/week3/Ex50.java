package week3;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type name: ");
            String name = reader.nextLine();
            if (name.length() >= 3) {
                char first = name.charAt(0);
                System.out.println("1. character: " + first);
                char second = name.charAt(1);
                System.out.println("2. character: " + second);
                char third = name.charAt(2);
                System.out.println("3. character: " + third);
            } else {
                break;
            }
            System.out.println();
        }
    }
}
