import java.util.Scanner;

/*
Program to print pattern from string like

I/P: WELCOME

O/P:
       C
      CO
     COM
    COME
   COMEW
  COMEWE
 COMEWEL

 */

public class MiddlePattern {
    private static void printPattern(String word) {
        int length = word.length();

        //Input Validation
        if (length % 2 == 0) {
            System.out.println("Please enter odd length string only");
            return;
        }

        //Find middle of string
        int mid = length / 2;

        for (int i = 0; i < length; i++) {
            //To print spaces
            for (int space = length - i; space > 0; space--) {
                System.out.print(" ");
            }
            //To print the characters
            for (int j = mid; j <= mid + i; j++) {
                System.out.print(word.charAt(j % length));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        printPattern(word);
    }

}
