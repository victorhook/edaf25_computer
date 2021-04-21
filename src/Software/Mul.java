package Software;

import Hardware.Operand;

public class Mul extends Arithmetic {

    public Mul(Operand op1, Operand op2, Operand addr) {
        super(op1, op2, addr);
    }

    @Override
    protected int compute(int op1, int op2) {
        return op1 * op2;
    }
}
