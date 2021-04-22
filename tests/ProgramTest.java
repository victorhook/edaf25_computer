import Hardware.Computer;
import Hardware.LongMemory;
import Software.Factorial;
import Software.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testFactorial() {
        String expected = "0 CPY 5 [0]\n" +
                "1 CPY 1 [1]\n" +
                "2 JEQ 6 [0] 1\n" +
                "3 MUL [1] [0] [1]\n" +
                "4 ADD [0] -1 [0]\n" +
                "5 JMP 2\n" +
                "6 PRT [1]\n" +
                "7 HLT\n" +
                "\n" +
                "120";

        Program factorial = new Factorial();
        System.out.println(factorial);
        Computer computer = new Computer(new LongMemory(1024));
        computer.load(factorial);
        computer.run();

        assertEquals(expected, outputStreamCaptor.toString().trim());
    }



}