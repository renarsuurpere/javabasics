package week1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Your age: ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
    }
}
