import java.util.Iterator;
import java.util.LinkedList;

public class Stack<Item> implements Iterable<Item> {
    private LinkedList<Item> stack = new LinkedList<>();

    public void push(Item item){
        stack.addFirst(item);
    }

    public Item pop() {
        return stack.isEmpty() ? null : stack.removeFirst();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public Iterator<Item> iterator(){
        return stack.iterator();
    }

}
