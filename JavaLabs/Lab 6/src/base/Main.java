package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating a LinkedList
     * - Creating a Queue
     * - Creating a Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {

        // Create an Array, Populate it, and Print it out
        int[] nums1 = {0, 1, 2, 3, 4};
        
        for(int i : nums1) {
            System.out.println(i);
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> nums2 = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            nums2.add(i);
        }
        
        System.out.println(nums2);

        // Create an LinkedList, Populate it, and Print it out
        LinkedList<Integer> nums3 = new LinkedList<Integer>();

        for(int i = 0; i < 5; i++) {
            nums3.add(i);
        }
        
        System.out.println(nums3);

        // Create an Queue, Populate it, and Print it out
        Queue<Integer> nums4 = new LinkedList<Integer>();

        for(int i = 0; i < 5; i++) {
            nums4.add(i);
        }

        System.out.println(nums4);

        // Create an Stack, Populate it, and Print it out
        Stack<Integer> nums5 = new Stack<Integer>();

        for(int i = 0; i < 5; i++) {
            nums5.push(i);
        }

        System.out.println(nums4);

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant aloe = new Plant(false, "Succulent", "Aloe");
        System.out.println(aloe.wateringInstructions());
        System.out.println(aloe.sunlightRequirements());
    }
}