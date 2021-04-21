package Hardware;

public class ProgramCounter {
	 private Integer pc;

	    public ProgramCounter() {
	        pc++;

	    }
	    public Integer getPc() {
	        return pc;

	    }
	    public Integer setPc(int pc) {
	        return  this.pc=pc;
	    }
}
