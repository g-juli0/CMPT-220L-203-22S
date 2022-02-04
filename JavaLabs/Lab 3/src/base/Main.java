package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        boolean gameOver = true;

        if (gameOver) {
            System.out.println("Game over!");
        }

        // Make an if, else statement where the else statement triggers a print or println statement
        gameOver = false;

        if (gameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("Keep going!");
        }

        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        int grade = 86;

        if (grade >= 90) {
            System.out.println("You got an A!");
        } else if (grade >= 80) {
            System.out.println("You got a B.");
        } else {
            System.out.println("Not good enough.");
        }

        // Make 2 variables and use them in an if else conditional print from one of the sections
        int num = 3;
        int guess = 7;

        if (guess == num) {
            System.out.println("You guessed the number!");
        } else {
            System.out.println("Try again.");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean graduatedCollege = true;
        boolean hasWorkExperience = true;

        if (graduatedCollege && hasWorkExperience) {
            System.out.println("You're hired");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean snowing = false;
        boolean icy = true;

        if (snowing || icy) {
            System.out.println("Classes are cancelled.");
        }
    }
}
