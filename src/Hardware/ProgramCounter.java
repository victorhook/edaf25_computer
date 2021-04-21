package Hardware;

public class ProgramCounter {
	 private long pc;

	    public ProgramCounter() {
	        pc = 0;
	    }

	    public long get() {
	        return pc;
	    }

	    public void set(long pc) {
	        this.pc = pc;
	    }

	    public void inc() {
	    	pc++;
		}

}
