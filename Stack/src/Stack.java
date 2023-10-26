public class Stack<T> {

    private int size;
    private StackNode top;

    public Stack() {

    }

    public void push(StackNode n) {
        size++;
        n.setParent(top);
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
