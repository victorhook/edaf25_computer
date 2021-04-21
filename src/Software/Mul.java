package Software;

import Hardware.Operand;

public class Mul extends Arithmetic {

    public Mul(Operand op1, Operand op2, Operand addr) {
        super(op1, op2, addr);
    }

    @Override
    protected String getSymbols() {
        return "MUL";
    }

    @Override
    protected long compute(long op1, long op2) {
        return op1 * op2;
    }
}
