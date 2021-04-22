package Hardware;

public class ProgramCounter {

	private int pc;

	public ProgramCounter() {
		pc = 0;
	}

	public int get() {
		return pc;
	}

	public void set(int pc) {
		this.pc = pc;
	}

	public void inc() {
		pc++;
		}

}
