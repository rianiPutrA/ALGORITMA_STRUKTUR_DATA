import java.util.Iterator;
import java.util.LinkedList;

public class Queue <Item> implements  Iterable<Item> {

    private LinkedList<Item> queue = new LinkedList<>();
    public void enqueue(Item item) { queue.addLast(item); }
    public Item dequeue() { return  queue.isEmpty() ? null : queue.removeFirst(); }
    public boolean isEmpty() { return queue.isEmpty(); }
    public int size() { return queue.size(); }
    public Iterator<Item> iterator() { return  queue.iterator(); }
}

