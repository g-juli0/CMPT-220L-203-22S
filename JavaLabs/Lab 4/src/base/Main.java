package src.base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        char grade = 'C';

        switch(grade){
            case 'A':
                System.out.println("Good job!"); break;
            case 'B':
                System.out.println("Almost there!"); break;
            case 'C':
                System.out.println("Average."); break;
            case 'D':
                System.out.println("Below average."); break;
            default:
                System.out.println("Study harder!"); break;
        }

        // Give me an example of you using a for loop
        for(int i = 1; i <= 5; i++){
            System.out.print("Line #");
            System.out.println(i);
        }

        // Give me an example of you using a while loop
        int sum = 0;
        
        while(sum < 20){
            sum += (int) (Math.random() * 5);
        }

        System.out.println(sum);

        // function calls
        System.out.println(exponent(2, 3));

        int[] arr = {2,3,5,2,3,6,7,8,2};
        System.out.println(count(arr, 2));

        System.out.println(summation(arr));

        System.out.println(pythagorean(3, 4));
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */

    static int exponent(int base, int power){
        int total = 1;
        for(int i = 0; i < power; i++){
            total *= base;
        }

        return total;
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */

    static int count(int[] array, int given){
        int count = 0;

        for(int num : array){
            if(num == given){
                count++;
            }
        }

        return count;
     }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    static int summation(int[] array){
        int sum = 0;

        for(int num : array){
            sum += num;
        }

        return sum;
     }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    static int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    static int division(int a, int b) {
        int answer = a / b;
        return answer;
    }

    static int pythagorean(int a, int b){
        int asquared = exponent(a, 2);
        int bsquared = exponent(b, 2);
        int csquared = addition(asquared, bsquared);
        return (int) Math.sqrt(csquared);
    }
}
