package Hardware;

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
		while(ProgramCounter.getPC() >= 0){
			program.executeLine(pc);
		}
	}
}
