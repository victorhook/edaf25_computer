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
	}

	public void run(){
		program.execute(this, memory);
	}

	public int getPc() {
        return pc.get();
    }

    public void incPc() {
		pc.inc();
	}

    public void setPc(int pc) {
        this.pc.set(pc);
    }
}
