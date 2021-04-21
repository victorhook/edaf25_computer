package Software;

import Hardware.Computer;
import Hardware.Memory;

public interface Instruction {

    void execute(Computer computer, Memory memory);

}
