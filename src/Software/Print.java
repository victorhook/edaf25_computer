package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Print implements Instruction {

    private Operand op;

    public Print(Operand op) {
        this.op = op;
    }

    @Override
    public int execute(Computer computer, Memory memory) {
        System.out.println(op.value(memory));
        return Program.PC_NOT_CHANGED;
    }

    @Override
    public String toString() {
        return String.format("PRT %s", op.printable());
    }

}
