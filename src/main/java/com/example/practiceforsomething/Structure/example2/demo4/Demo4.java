package com.example.practiceforsomething.Structure.example2.demo4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Classname: Main
 * Package: com.example.practiceforsomething.Structure.example2.demo4
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:14
 * @Version: v1.0
 */
public class Demo4 {
    public static void play(String path) throws IOException {
        File inFile = new File(path);
        String path1 = Paths.get("example2", "output.txt").toString();
        File outFile = new File(path1);
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();
    }
}
