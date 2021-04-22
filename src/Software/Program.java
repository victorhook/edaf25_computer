package Software;

import Hardware.Computer;
import Hardware.Memory;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Program extends ArrayList<Instruction> {

	public static final int PC_HALT = -1,
							PC_CHANGED = 0,
							PC_NOT_CHANGED = 1;

	/** Executes the program. */
	public void execute(Computer computer, Memory memory) {

		while(computer.getPc() != PC_HALT) {
			Instruction instruction = get(computer.getPc());

			int result = instruction.execute(computer, memory);
			// Check if the instruction changed the pc value (eg jump, halt etc) or we should increment int.
			if (result == Program.PC_NOT_CHANGED) {
				computer.incPc();
			}
		}
	}

	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner("\n");
		for (int i = 0; i < size(); i++) {
			sj.add(String.format("%d %s", i, get(i).toString()));
		}
		return sj.toString() + "\n";
	}

}
