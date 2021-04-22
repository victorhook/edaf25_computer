package Hardware;

import java.math.BigInteger;

public abstract class Operand {

	public BigInteger value(Memory memory) {
		if (this instanceof Address) {
			return ((Address) this).read(memory);
		} else {
			return ((Word) this).getValue();
		}
	}

	public abstract String printable();

}
