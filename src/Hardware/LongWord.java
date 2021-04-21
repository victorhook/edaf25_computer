package Hardware;

public class LongWord extends Word {

    public LongWord(long value) {
        super(value);
    }

    @Override
    protected int getSize() {
        return 64;
    }
}
