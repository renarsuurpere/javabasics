package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what: ");
        int untilNumber = Integer.parseInt(reader.nextLine());

        int currentNumber = 1;
        int sum = 0;

        while (currentNumber <= untilNumber) {
            sum += currentNumber;
            currentNumber++;
        }
        System.out.println("Sum is " + sum);
    }
}

