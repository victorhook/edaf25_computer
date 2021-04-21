package Software;

public class Program {
	import Software.Instruction;
	import java.util.ArrayList;

	public class Program extends ArrayList<Instruction> {
	    ProgramCounter pc= new ProgramCounter();

	    public void execute(Memory memory) {
	        
	        while(pc.getPc()!=-1) {
	        get(pc.getPc()).execute(memory);
	    }

	    }
	}
}
