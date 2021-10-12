package week3;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        int letters = text.length();
        String reversed = " ";
        while (true) {
            if (letters >= 0) {
                String character;
                if(letters < text.length()){
                   character  = text.substring(letters, letters+1);
                } else {
                    character = text.substring(letters);
                }
                reversed += character;
                letters--;
            } else {
                break;
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
