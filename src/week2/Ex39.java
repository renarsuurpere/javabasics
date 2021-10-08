package week2;

public class Ex39 {

    // Ex 39.1 Printing stars

 /*   public static void printStars(int amount) {
        for (int i=0; i<amount; i++) {
                System.out.print("* "); //print star
            }
            System.out.println(); //ending line after each row
        }



    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
  */

    // Ex 39.2 Printing a square

/* public static void printSquare(int sideSize) {
     for (int j = 0; j < sideSize; j++) {
         for (int i = 0; i < sideSize; i++) {
             System.out.print("* "); //print star
         }
         System.out.println(); //ending line after each row
     }
 }


    public static void main(String[] args) {
        printSquare(5);
    }
*/

    // Ex 39.3 Printing a rectangle

/*    public static void printRectangle(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("* "); //print star
            }
            System.out.println(); //ending line after each row
        }
    }


    public static void main(String[] args) {
        printRectangle(17,3);
    }
*/

    // Ec 39.4 Printing a left-aligned triangle

    public static void printTriangle(int size) {
         for (int i = 0; i < size; i++){
             for (int j = 0; j <= i; j++) {
                System.out.print("* "); //print star
            }
            System.out.println(); //ending line after each row
        }
    }


    public static void main(String[] args) {
        printTriangle(7);
    }
}

