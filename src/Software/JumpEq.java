package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class JumpEq implements Instruction {

    private int eq;
    private Operand addr, comparer;

    public JumpEq(int eq, Operand comparer, Operand addr) {
        this.eq = eq;
        this.comparer = comparer;
        this.addr = addr;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        if (comparer.value() == eq) {
            computer.setPc(addr.value());
        } else {
            computer.incPc();
        }

    }

    @Override
    public String toString() {
        return String.format("JEQ %s %s %s", eq, addr.printable(), comparer.printable());
    }

}
