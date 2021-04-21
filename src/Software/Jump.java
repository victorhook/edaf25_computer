package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Jump implements Instruction {

    private Operand addr;

    public Jump(Operand addr) {
        this.addr = addr;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        computer.setPc(addr.value());
    }
}
