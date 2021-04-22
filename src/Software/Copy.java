package Software;

import Hardware.Address;
import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Copy implements Instruction {

    private Operand from;
    private Address to;

    public Copy(Operand from, Address to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int execute(Computer computer, Memory memory) {
        memory.write(to.getAddr(), from.value(memory));
        return Program.PC_NOT_CHANGED;
    }

    @Override
    public String toString() {
        return String.format("CPY %s %s", from.printable(), to.printable());
    }
}
