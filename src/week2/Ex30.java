package week2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert number: ");
        int wish = Integer.parseInt(reader.nextLine());

        int number = 0;
        while (number < wish) {
            number++;
            System.out.println(number);
        }
    }
}

