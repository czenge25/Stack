import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        Stack s = new Stack();

        for (int i = 0; i < 10; i++) {
            s.push(r.nextInt(100));
            System.out.println(s.peek());
        }
        System.out.println("Size: " + s.size());

        System.out.println("---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Size: " + s.size());
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("Size: " + s.size());

        System.out.println("---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Size: " + s.size());
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("Size: " + s.size());

        System.out.println("---");

        System.out.println("Stack is empty: " + s.isEmpty());
        System.out.println("Size: " + s.size());

        System.out.println("---");

    }
}