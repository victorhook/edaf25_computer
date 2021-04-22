package Hardware;

import java.math.BigInteger;

public abstract class Word extends Operand {

    @Override
    public String printable() {
        return getValue().toString();
    }

    public abstract BigInteger getValue();

    protected abstract int getSize();

}
