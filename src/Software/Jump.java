package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class Jump implements Instruction {

    private int addr;

    public Jump(int addr) {
        this.addr = addr;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        computer.setPc(addr);
    }

    @Override
    public String toString() {
        return String.format("JPM %s", addr);
    }

}
