package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;


        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            int remainder = number % 2;

            if (number < 0) {
                break;  // end the loop
            } else {
                sum += number;
                count++;
                if(remainder == 1){
                    odd++;
                } else {
                    even++;
                }
            }
        }
        double average = sum / (double)count;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
