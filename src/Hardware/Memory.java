package Hardware;

public abstract class Memory {

    protected Address[] mem;

    public Memory(int size) {
        this.mem = new Address[size];
    }

    public int read(int addr) {
        return mem[addr].value();
    }

    public void write(int addr, Word value) {
        mem[addr] = getWord(value);
    }

    protected abstract Word getWord(Word word);

}
