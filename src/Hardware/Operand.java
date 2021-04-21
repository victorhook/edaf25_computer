package Hardware;

public interface Operand {

	public Integer Value();
	public Word getWord(Memory context);
	public String print();
}
