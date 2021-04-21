package Software;

import Hardware.Computer;
import Hardware.Memory;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Program extends ArrayList<Instruction> {

	public void execute(Computer computer, Memory memory) {
		while(computer.getPc() != -1) {
			Instruction instruction = get((int) computer.getPc());



			System.out.printf("[%s] - %s\n", computer.getPc(), instruction);
			try {
				Thread.sleep(800);
			} catch (Exception e) {}

			instruction.execute(computer, memory);
			if (!(instruction instanceof Jump || instruction instanceof JumpEq)) {
				computer.incPc();
			}
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
