package Hardware;

import java.math.BigInteger;

public class LongWord extends Word {

    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public BigInteger getValue() {
        return new BigInteger(String.valueOf(value));
    }

    @Override
    protected int getSize() {
        return 64;
    }
}
