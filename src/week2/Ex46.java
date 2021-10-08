package week2;

public class Ex46 {
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;

        return sum / 4.0;
    }

    public static void main(String[] args) {
        double answer = average(7, 9, 4, 6);
        System.out.println("average: " + answer);
    }
}
