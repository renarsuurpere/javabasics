package week3;

import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for( int i : list) {
            sum += i;
        }
        float size = list.size();


        return sum / size;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }
}
