import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        /* Try 7 Catch Exceptions w/ in Do While Loop
        * In this example the user will input two numbers on the console and divide them.
        * If the user divides by 0 they will receive an error in the console saying try again.
        * The Try statement allows you to define a block of code to be tested for errors while it is being executed.
        * The Catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
        *   */

        Scanner input = new Scanner(System.in);

        int x = 1;

        do {
            try {
                System.out.println("Enter first num: ");
                int n1 = input.nextInt();
                System.out.println("Enter second num: ");
                int n2 = input.nextInt();
                int sum = n1 / n2;
                System.out.println(sum);
                x = 2;
            } catch (Exception e) {
                System.out.println("You can't do that");
            }
        } while (x == 1);

    }
}
