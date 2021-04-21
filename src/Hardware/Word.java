package Hardware;

public abstract class Word extends Operand {

    public Word(long value) {
        super(value);
    }

    @Override
    public String printable() {
        return String.valueOf(getSize());
    }

    protected abstract int getSize();

}
