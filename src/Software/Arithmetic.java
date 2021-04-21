package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public abstract class Arithmetic implements Instruction {
    private Operand op1, op2, addr;

    public Arithmetic(Operand op1, Operand op2, Operand addr) {
        this.op1 = op1;
        this.op2 = op2;
        this.addr = addr;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        long result = compute(op1.value(), op2.value());
        memory.write(addr.value(), result);
    }

    protected abstract long compute(long op1, long op2);

}
