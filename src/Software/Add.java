package Software;

import Hardware.Operand;

public class Add extends Arithmetic {

    public Add(Operand op1, Operand op2, Operand addr) {
        super(op1, op2, addr);
    }

    @Override
    protected String getSymbols() {
        return "ADD";
    }

    @Override
    protected long compute(long op1, long op2) {
        return op1 + op2;
    }
}
