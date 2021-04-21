package Hardware;

import Software.Program;

public class Computer {
	private Memory memory;
	private Program program;
	private ProgramCounter pc;
	
	public Computer(Memory memory){
		this.memory = memory;
		pc = new ProgramCounter();
	}
	
	public void load(Program program){
		this.program = program;
		program.setContext(memory);
	}
	
	public void run(){
		program.execute(this, memory);
	}

	public long getPc() {
        return pc.getPc();
    }

    public void incPc() {
		setPc(getPc() + 1);
	}

    public void setPc(long pc) {
        this.pc.setPc(pc);
    }
}
