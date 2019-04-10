import java.util.Iterator;

public class Coada<T> implements Iterable<T>{
    private Nod<T> head;

    public void add(T data) {
        Nod<T> newNode = new Nod<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Nod curr = head;
        while (curr.getNextNod() != null) {
            curr = curr.getNextNod();
        }
        curr.setNextNod(newNode);
    }

    public Nod<T> peek() {
        if (head == null)
            return null;
        return head;
    }

    public Nod<T> getFromPosition(int position) {
        Nod<T> curr = head;
        for (int i = 0; i < position; i++)
            curr = curr.getNextNod();

        return curr;
    }

    public Nod remove() {
        if (head == null)
            return null;
        Nod headCopy = head;
        head = head.getNextNod();
        return headCopy;
    }

    public int size() {
        int size = 0;
        Nod<T> curr = head;
        while (curr != null) {
            size++;
            curr = curr.getNextNod();
        }
        return size;
    }

    //sa afisez totu mai usor
    public void afiseaza() {
        Nod<T> curr = head;
        while (curr != null) {
            System.out.println(curr.getVal());
            curr = curr.getNextNod();
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new CoadaIterator<T>(this);
    }
}

