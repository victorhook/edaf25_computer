package Hardware;

public abstract class Memory<T> {

    protected T mem[];

    protected Memory(int size) {
        mem = (T []) new Object[size];
    }

    public T read(int addr) {
        return mem[addr];
    }
    public void write(int addr, T value) {
        mem[addr] = value;
    }

}
