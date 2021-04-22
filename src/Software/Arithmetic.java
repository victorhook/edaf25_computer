package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

import java.math.BigInteger;

public abstract class Arithmetic implements Instruction {
    private Operand op1, op2, addr;

    public Arithmetic(Operand op1, Operand op2, Operand addr) {
        this.op1 = op1;
        this.op2 = op2;
        this.addr = addr;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        BigInteger result = compute(op1.value(memory), op2.value(memory));
        int address = addr.value(memory).intValue();
        memory.write(address, result);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", getSymbols(), op1.printable(), op2.printable(), addr.printable());
    }

    protected abstract String getSymbols();
    protected abstract BigInteger compute(BigInteger op1, BigInteger op2);

}
