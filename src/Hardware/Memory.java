package Hardware;

public abstract class Memory {

    protected Operand[] mem;

    public Memory(int size) {
        this.mem = new Operand[size];
    }

    public long read(long addr) {
        Operand value = mem[(int) addr];
        return value == null ? 0 : value.value();
    }

    public void write(long addr, long value) {
        mem[(int) addr] = getWord(value);
    }

    protected abstract Word getWord(long word);

}
