import java.util.Iterator;

public class CoadaIterator<T> implements Iterator<T> {
    Nod<T> current;

    public CoadaIterator(Coada<T> coada) {
        current = coada.peek();
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T val = current.getVal();
        current = current.getNextNod();
        return val;
    }


}