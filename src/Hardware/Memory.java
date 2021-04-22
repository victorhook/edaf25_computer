package Hardware;

import java.math.BigInteger;

public abstract class Memory {

    public abstract BigInteger read(int addr);
    public abstract void write(int addr, BigInteger value);

}
