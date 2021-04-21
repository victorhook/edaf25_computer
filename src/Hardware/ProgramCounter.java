package Hardware;

public class ProgramCounter {
	 private long pc;

	    public ProgramCounter() {
	        pc++;

	    }
	    public long getPc() {
	        return pc;

	    }
	    public void setPc(long pc) {
	        this.pc=pc;
	    }
}
