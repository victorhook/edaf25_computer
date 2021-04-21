package Software;

import Hardware.Computer;
import Hardware.Memory;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Program extends ArrayList<Instruction> {

	public void execute(Computer computer, Memory memory) {
		while(computer.getPc() != -1) {
			get((int) computer.getPc()).execute(computer, memory);
			computer.incPc();
		}
	}

	public String toString() {
		StringJoiner sj = new StringJoiner("\n");

		for (Instruction instruction: this) {
			sj.add(instruction.toString());
		}

		return sj.toString();
	}

}
