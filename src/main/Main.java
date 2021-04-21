package main;

import Hardware.Computer;
import Hardware.LongMemory;
import Software.Factorial;
import Software.Program;

public class Main {

    public static void main(String[] args) {
        Program factorial = new Factorial();
        System.out.println(factorial);
        Computer computer = new Computer(new LongMemory(1024));
        computer.load(factorial);
        computer.run();
    }

}
