package Hardware;

public abstract class Word extends Operand {

    public Word(long value) {
        super(value);
    }

    @Override
    public String printable() {
        return String.valueOf(value());
    }
    protected abstract int getSize();

}
