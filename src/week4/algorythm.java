package week4;

import java.util.Scanner;

public class algorythm {
    public static int maxNum() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Max Number: ");
        return reader.nextInt();
    }

    public static void genereerijada() {
        int number = 1;
        int soovitud = maxNum();

        while (number <= soovitud) {
            if (number % 3 == 0 && number % 15 != 0) {
                System.out.println("Kill");
            } else if (number % 5 == 0 && number % 15 != 0) {
                System.out.println("Kõll");
            } else if (number % 15 == 0) {
                System.out.println("Killkõll");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void kahanev() {
        int number = 1;
        int soovitud = maxNum();

        while (number <= soovitud) {
            if (soovitud % 4 == 0) {
                System.out.println(soovitud);
            }
            soovitud--;
        }
    }


    public static void main(String[] args) {
        System.out.println("Killi ja kõlli ja killikõlli teema:");
        genereerijada();
        System.out.println("Neljaga jaguneva kahaneva teema:");
        kahanev();
    }
}
