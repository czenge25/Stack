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

    public T pop() {
        StackNode oldTop = top;
        top = top.getParent();
        return (T) oldTop.getData();
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
