package Hardware;

public abstract class Operand {

	private long value;

	public Operand(long value) {
		this.value = value;
	}

	public long value() {
		return value;
	}

	public void print() {
		System.out.println(printable());
	}

	protected abstract String printable();

}
