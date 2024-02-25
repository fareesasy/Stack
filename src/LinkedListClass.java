/**
 * @author Fareesa Syeda
 * syedaf@merrimack.edu
 * CSC 6301 - Software Design and Documentation
 * @version 2.0.0
 * @since Week 5 Project
 * The java implementation of a Stack class using java utility package.
 */


import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * This class represents a LinkedList implementation for storing and sorting integers.
 */
public class LinkedListClass {
    private LinkedList<Integer> list; // LinkedList to store integers

    /**
     * Constructs a new LinkedListClass with an empty LinkedList.
     */
    public LinkedListClass() {
        this.list = new LinkedList<>();
    }

    /**
     * Adds an integer to the LinkedList.
     * @param num The integer to add.
     */
    public void addInteger(int num) {
        list.add(num);
    }

    /**
     * Sorts the LinkedList in ascending order.
     */
    public void sortList() {
        Collections.sort(list);
    }

    /**
     * Prints the content of the LinkedList.
     */
    public void printList() {
        System.out.println("Sorted linked list:");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
