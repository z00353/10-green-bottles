import java.util.Scanner;

public class myApp {
    //'public'(accessible from all members of the class), 'static'(belongs to the class only),
    //'void'(does not return a value), 'main'(only one main method in the program)
    public static void main (String[] args){


        // Creating Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Calling method 1
        System.out.println("10 Green bottles test:\n");// Print a line
        GreenBottles.tenGreenBottles();// Calling the method
        System.out.println("--------------------------------------------------------");

        // Calling method 2
        System.out.println("X Green bottles test:\n");// Print a line
        System.out.println("Enter number of bottles:");// User input prompt
        int x = keyboard.nextInt();// Value assigned to variable 'x' from keyboard input
        System.out.print("\n");
        GreenBottles.xGreenBottles(x);// Calling the method
        System.out.println("--------------------------------------------------------");

        // Calling method 3
        System.out.println("XY Green bottles test:\n");// Print a line
        System.out.println("Enter number of bottles:");// User input prompt
        x = keyboard.nextInt();// Value assigned to variable 'x' from keyboard input. Type int for 'x' is already defined
        System.out.println("Enter step to reduce bottles:");// User input prompt
        int y = keyboard.nextInt();// Value assigned to variable 'y' from keyboard input.
        System.out.print("\n");
        GreenBottles.xyGreenBottles(x,y);// Calling the method
    }
}