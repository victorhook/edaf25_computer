package Hardware;

import java.math.BigInteger;

public class LongMemory extends Memory {

    private long mem[];

    public LongMemory(int size) {
        mem = new long[size];
    }

    @Override
    public BigInteger read(int addr) {
        return new BigInteger(String.valueOf(mem[addr]));
    }

    @Override
    public void write(int addr, BigInteger value) {
        mem[addr] = value.longValue();
    }

}
