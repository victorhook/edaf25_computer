package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Copy implements Instruction {

    private Operand from, to;

    public Copy(Operand from, Operand to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        memory.write(to.value(), from.value());
    }
}
