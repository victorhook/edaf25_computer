package Software;

import Hardware.Computer;
import Hardware.Memory;
import Hardware.Operand;

public class JumpEq implements Instruction {

    private int addr;
    private Operand comp1, comp2;

    public JumpEq(int addr, Operand comp1, Operand comp2) {
        this.addr = addr;
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        int diff = comp1.value(memory).compareTo(comp2.value(memory));

        System.out.printf("Comparing %s with %s, addr: %s\n", comp1.value(memory), comp2.value(memory), addr);

        if (diff == 0) {
            computer.setPc(addr);
        } else {
            computer.incPc();
        }

    }

    @Override
    public String toString() {
        return String.format("JEQ %s %s %s", addr, comp1.printable(), comp2.printable());
    }

}
