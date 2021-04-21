package Software;

import Hardware.Computer;
import Hardware.Memory;

import java.util.ArrayList;

public class Program extends ArrayList<Instruction> {

	public void execute(Computer computer, Memory memory) {
		while(computer.getPc() != -1) {
			get((int) computer.getPc()).execute(computer, memory);
			computer.setPc(computer.getPc() + 1);
		}

	}
}
