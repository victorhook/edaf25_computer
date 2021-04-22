package Software;

import Hardware.Address;
import Hardware.Operand;

import java.math.BigInteger;

public class Mul extends Arithmetic {

    public Mul(Operand op1, Operand op2, Address addr) {
        super(op1, op2, addr);
    }

    @Override
    protected String getSymbols() {
        return "MUL";
    }

    @Override
    protected BigInteger compute(BigInteger op1, BigInteger op2) {
        return op1.multiply(op2);
    }
}
