package Hardware;

public class LongMemory extends Memory {

    public LongMemory(int size) {
        super(size);
    }

    protected Word getWord(long word) {
        return new LongWord(word);
    }
}
