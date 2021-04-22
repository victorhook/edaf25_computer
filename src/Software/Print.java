package Software;

import Hardware.Address;
import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Print implements Instruction {
    private Operand op;

    public Print(Operand op) {
        this.op = op;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        System.out.println(op.value(memory));
    }

    @Override
    public String toString() {
        return String.format("PRT %s", op.printable());
    }

}
