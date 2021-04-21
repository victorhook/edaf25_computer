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
    
    public Word get(int index){
		if(index > memory.size || index < 0){
			return null;
		}else{
			return memory[index];
		}

    protected abstract Word getWord(Word word);

}
