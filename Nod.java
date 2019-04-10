public class Nod <T>{
    private T val;
    private Nod nextNod;

    public Nod(T val) {
        this.val = val;
        nextNod = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Nod getNextNod() {
        return nextNod;
    }

    public void setNextNod(Nod nextNod) {
        this.nextNod = nextNod;
    }
}
