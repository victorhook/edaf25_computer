package Software;

import Hardware.Computer;
import Hardware.Memory;

public interface Instruction {

    /* Executes an instruction and returns the result of the instruction.
        It can be one of the following:
            1. The instruction changed the value of the program counter.
            1. The instruction DID NOT change the value of the program counter.
     */
    int execute(Computer computer, Memory memory);

}
