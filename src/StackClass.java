/**
 * @author Fareesa Syeda
 * syedaf@merrimack.edu
 * CSC 6301 - Software Design and Documentation
 * @version 2.0.0
 * @since Week 5 Project
 * The java implementation of a Stack class using java utility package.
 */


import java.util.Stack;
import java.util.Collections;

/**
 * This class represents a Stack implementation for storing and sorting integers.
 * It utilizes the java.util.Stack class.
 */
public class StackClass {
    private Stack<Integer> stack; // Stack to store integers

    /**
     * Constructs a new StackClass with an empty Stack.
     */
    public StackClass() {
        this.stack = new Stack<>();
    }

    /**
     * Pushes an integer onto the top of the stack.
     * @param num The integer to push onto the stack.
     */
    public void pushInteger(int num) {
        stack.push(num);
    }

    /**
     * Sorts the integers in the stack in ascending order.
     */
    public void sortStack() {
        Collections.sort(stack);
    }
    

    /**
     * Prints the content of the stack.
     */
    public void printStack() {
        System.out.println("Sorted stack:");
        for (Integer num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
