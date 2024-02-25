/**
 * @author Fareesa Syeda
 * syedaf@merrimack.edu
 * CSC 6301 - Software Design and Documentation
 * @version 2.0.0
 * @since Week 5 Project
 * The java implementation of a Stack class using java utility package.
 */

 /**
 * Steps taken to run the program on the command line:
 * pwd
 * "cd / path to directory" to go inside "src" folder
 * .java file compiled using this command: "javac App.java LinkedListClass.java StackClass.java"
 * program was run using this command: "java App"
 * javadocs was created using this command: go inside "src" folder and type: "javadoc -d docs src/*.java"
 */

import java.util.Scanner;
/**
 * This class is an application to choose between two implementations: sorting integers using a Stack or a Linked List.
 */
public class App {
    private static Scanner scanner = new Scanner(System.in); //initiailize and declare scanner variable 
    /**
     * The main method of the application.
     * Prompts the user to choose a stack or linked list implementation and performs the chosen operation.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Choose implementation: ");
        System.out.println("1. Stack");
        System.out.println("2. Linked List");
        int choice = scanner.nextInt();

        if (choice == 1) {
            performStackImplementation();
        } else if (choice == 2) {
            performLinkedListImplementation();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close(); //close scanner
    }

    /**
     * This method performs a stack implementation by storing, sorting, and printing the sorted stack:
     * first creating an instance of the StackClass class, which encapsulates the functionality related to the stack implementation;
     * it prompts user to enter a list of integer numbers, separated by a space, and then press enter;
     * It reads each integer entered by the user using scanner;
     * It pushes each integer onto the stack using the pushInteger() method of the stackClass object;
     * After the user has finished inputting integers, the stack is sorted in ascending order using the sortStack() method of the stackClass object;
     * Finally, it prints the sorted stack using the printStack() method of the stackClass object. 
     */
    private static void performStackImplementation() {
        StackClass stackClass = new StackClass();

        System.out.println("Enter a list of integer numbers, separated by a space, then type any letter and, press enter: ");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            stackClass.pushInteger(num);
        }

        stackClass.sortStack();

        System.out.println("Sorted stack:");
        stackClass.printStack();
    }

    /**
     * This method performs a linked list implementation by storing, sorting, and printing the sorted linked list:
     * first creating an instance of the LinkedListClass class, which encapsulates the functionality related to the linked list implementation;
     * it prompts user to enter a list of integer numbers, separated by a space, and then press enter;
     * It reads each integer entered by the user using scanner;
     * It adds each integer to the linked list using the addInteger() method of the linkedListClass object;
     * After the user has finished inputting integers,  the linked list is sorted in ascending order using the sortList() method of the linkedListClass object;
     * Finally, it prints the sorted linked list using the printList() method of the linkedListClass object. 
     */
    private static void performLinkedListImplementation() {
        LinkedListClass linkedListClass = new LinkedListClass();

        System.out.println("Enter a list of integer numbers, separated by a space, then type any letter and, press enter: ");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            linkedListClass.addInteger(num);
        }

        linkedListClass.sortList();

        System.out.println("Sorted linked list:");
        linkedListClass.printList();
    }
}
