package Software;

import Hardware.Computer;
import Hardware.Memory;

public class Halt implements Instruction {

    @Override
    public void execute(Computer computer, Memory memory) {
        computer.setPc(-1);
    }

    public String toString() {
        return "HLT";
    }

}
