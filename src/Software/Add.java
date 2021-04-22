package Software;

import Hardware.Address;
import Hardware.Operand;

import java.math.BigInteger;

public class Add extends Arithmetic {

    public Add(Operand op1, Operand op2, Address addr) {
        super(op1, op2, addr);
    }

    @Override
    protected String getSymbols() {
        return "ADD";
    }

    @Override
    protected BigInteger compute(BigInteger op1, BigInteger op2) {
        return op1.add(op2);
    }
}
