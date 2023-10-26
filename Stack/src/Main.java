/*
CZ
11/2/23
HK
 */

import java.util.Random;

// The main class responsible for testing the stack implementation
public class Main {
    public static void main(String[] args) {

        // Create a new random number generator
        Random r = new Random();

        // Create a stack instance
        Stack s = new Stack();

        // Push 10 random integers onto the stack and print the top element at each step
        for (int i = 0; i < 10; i++) {
            s.push(r.nextInt(100)); // Push a random integer onto the stack
            System.out.println(s.peek()); // Print the top element of the stack
        }
        System.out.println("Size: " + s.size()); // Print the size of the stack

        System.out.println("---");

        // Pop 5 elements from the stack, printing the size and top element at each step
        for (int i = 0; i < 5; i++) {
            System.out.println("Size: " + s.size()); // Print the size before popping
            System.out.println(s.peek()); // Print the top element before popping
            s.pop(); // Pop the top element from the stack
        }
        System.out.println("Size: " + s.size()); // Print the size after popping

        System.out.println("---");

        // Attempt to pop 5 more elements, printing the size and top element at each step
        for (int i = 0; i < 5; i++) {
            System.out.println("Size: " + s.size()); // Print the size before popping
            System.out.println(s.peek()); // Print the top element before popping
            s.pop(); // Pop the top element from the stack
        }
        System.out.println("Size: " + s.size()); // Print the size after popping

        System.out.println("---");

        // Check if the stack is empty and print its size
        System.out.println("Stack is empty: " + s.isEmpty()); // Check if the stack is empty
        System.out.println("Size: " + s.size()); // Print the size of the stack

        System.out.println("---");

    }
}