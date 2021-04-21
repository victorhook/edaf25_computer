package Hardware;

public class Address extends Operand {

	public Address(long value) {
		super(value);
	}

	@Override
	public String printable() {
		return "[" + value() + "]";
	}

}

