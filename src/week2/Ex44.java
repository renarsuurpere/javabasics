package week2;

// import java.util.Scanner;

public class Ex44 {

    public static int least(int number1, int number2) {

        // Saab ka küsida numbrid
/*        Scanner reader = new Scanner(System.in);
        System.out.print("first number: ");
        number1 = Integer.parseInt(reader.nextLine());
        System.out.print("second number: ");
        number2 = Integer.parseInt(reader.nextLine()); */
        return Math.min(number1, number2);
    }

    public static void main(String[] args) {
        int answer =  least(5, 9);
        System.out.println("Least: " + answer);
    }

}
