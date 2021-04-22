package Software;

import Hardware.Computer;
import Hardware.Memory;

public class Halt implements Instruction {

    @Override
    public int execute(Computer computer, Memory memory) {
        computer.setPc(-1);
        return Program.PC_CHANGED;
    }

    public String toString() {
        return "HLT";
    }

}
