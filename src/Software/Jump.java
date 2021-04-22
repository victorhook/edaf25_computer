package Software;

import Hardware.Computer;
import Hardware.Memory;

public class Jump implements Instruction {

    private int addr;

    public Jump(int addr) {
        this.addr = addr;
    }

    @Override
    public int execute(Computer computer, Memory memory) {
        computer.setPc(addr);
        return Program.PC_CHANGED;
    }

    @Override
    public String toString() {
        return String.format("JMP %s", addr);
    }

}
