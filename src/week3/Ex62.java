package week3;

import java.util.ArrayList;

public class Ex62 {
    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println( word );
        }
    }

    public static void removeLast(ArrayList<String> list) {
        int last = list.size() - 1;
        list.remove(last);
    }

    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("Array: ");
        print(brothers);

        removeLast(brothers);

        System.out.println();

        System.out.println("Array without last: ");
        print(brothers);
    }

}
