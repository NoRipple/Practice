package com.example.practiceforsomething.Design.Facade;

/**
 * Classname: Mainframe
 * Package: com.example.practiceforsomething.Design.Facade
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 12:37
 * @Version: v1.0
 */
public class Mainframe {
    Memory memory;
    CPU cpu;
    HardDisk hardDisk;
    OS os;

    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }
    public void on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
        System.out.println("pc start successfully");
    }
}
