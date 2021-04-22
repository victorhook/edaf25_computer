package Software;

import Hardware.Address;
import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

import java.math.BigInteger;

public abstract class Arithmetic implements Instruction {
    private Operand op1, op2;
    private Address addr;

    public Arithmetic(Operand op1, Operand op2, Address addr) {
        this.op1 = op1;
        this.op2 = op2;
        this.addr = addr;
    }

    @Override
    public int execute(Computer computer, Memory memory) {
        BigInteger result = compute(op1.value(memory), op2.value(memory));
        memory.write(addr.getAddr(), result);
        return Program.PC_NOT_CHANGED;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", getSymbols(), op1.printable(), op2.printable(), addr.printable());
    }

    protected abstract String getSymbols();
    protected abstract BigInteger compute(BigInteger op1, BigInteger op2);

}
