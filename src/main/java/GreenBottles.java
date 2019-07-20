/**
 * This program prints out the words to the song Ten Green Bottles
 * A 'for' loop is used for its implementation
 * The 'for' loop is accessed by all methods in the program thus avoiding code repetition
 * The program also prints out the words using one and two variables from keyboard input
 * All methods are void since they don't return a value.
 * All methods are static since they do not require calling objects
 *
 * @author Elitsa Popova
 * @version 09/12/16
 */

public class GreenBottles {
    // Method to print out the words
    public static void tenGreenBottles() {
        xyGreenBottles(10, 1);// Method used as a variable with two arguments (counter and step reducing the bottles)
    }

    // Method to print out the words with counter 'x' as a variable
    public static void xGreenBottles(int x) {// Method takes one parameter 'x'
        xyGreenBottles(x, 1);// Method used as a variable with two arguments (counter and step reducing the bottles)
    }

    // Method to print out the words with counter 'x 'and step 'y' as variables
    public static void xyGreenBottles(int x, int y) {// Method takes two parameters 'x' and 'y'
        // 'if-else' statement
        if ((x < y || y < 0)) {// Boolean expression for error. If 'counter' is less than 'step' or 'step' is less than zero
            System.out.println("Error");// print out this statement
        } else {// Else proceed with 'for' loop
            // 'for' loop with two if-else statements
            // 'for' loop implemented in xyGreenBottles(int x, int y) method as it is the method with most variables as parameters
            for (int counter = x; (counter > 0); counter = counter - y) {// Initialization, termination, decrement as arguments
                // 'if-else' statement
                if (counter == 1) {// If counter (bottles) is one:
                    System.out.println(counter + " green bottle standing on the wall,");// For singular, print '...bottle...'
                    System.out.println(counter + " green bottle standing on the wall,");
                } else {// Else print this:
                    System.out.println(counter + " green bottles standing on the wall,");// For plural, print '...bottles...'
                    System.out.println(counter + " green bottles standing on the wall,");
                }
                // 'if-else' statement for last two lines of the song
                if (counter - y > 1) {// If decremented by 1, counter is still greater than 1:
                    System.out.println("And if " + y + " green bottle should accidently fall");
                    System.out.println("There will be " + (counter - y) + " bottles standing on the wall");// Print '...bottles...'
                } else if (counter - y == 1) {// Or if decremented by 1, counter is 1:
                    System.out.println("And if " + y + " green bottle should accidently fall");
                    System.out.println("There will be " + (counter - y) + " bottle standing on the wall");// Print '...bottle...'
                } else {// Otherwise, print this:
                    System.out.println("And if " + counter + " bottle should accidently fall");
                    System.out.println("There will be no green bottles standing on the wall");

                }
                System.out.println("\n");// Separator
            }
        }
    }
}