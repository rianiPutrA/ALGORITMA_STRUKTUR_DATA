import java.util.Iterator;
import java.util.LinkedList;

public class Bag<Item> implements Iterable<Item>{
    private LinkedList<Item> items = new LinkedList<>();

    public void add(Item item){
        items.add(item);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }
    public int size(){
        return items.size();
    }
    public Iterator<Item> iterator(){
        return items.iterator();
    }
}