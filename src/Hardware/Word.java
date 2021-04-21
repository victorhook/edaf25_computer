package Hardware;

public abstract class Word implements Operand {

    @Override
    public Integer Value() {
        return null;
    }

    @Override
    public String print() {
        return String.valueOf(getSize());
    }

    protected abstract int getSize();


}
