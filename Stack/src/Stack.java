public class Stack<T> {

    private int size;
    private StackNode top;

    public Stack() {

    }

    public void push(T data) {
        size++;
        StackNode n = new StackNode(data, top);
        top = n;
    }

    public StackNode pop() {

    }

    public StackNode peek() {

    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

}
