package Hardware;

import java.math.BigInteger;

public class Address extends Operand {

	private int addr;

	public Address(int value) {
		addr = value;
	}

	public int getAddr() {
		return addr;
	}

	public BigInteger read(Memory memory) {
		return memory.read(addr);
	}

	@Override
	public String printable() {
		return String.format("[%s]", addr);
	}
}

