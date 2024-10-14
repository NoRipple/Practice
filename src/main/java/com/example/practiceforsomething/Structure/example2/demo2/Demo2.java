package com.example.practiceforsomething.Structure.example2.demo2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classname: Main
 * Package: com.example.practiceforsomething.Structure.example2.object
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:34
 * @Version: v1.0
 */
public class Demo2 {
    public static void play(String path) {
        Input input = new Input();
        input.input(path);
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        Path path1 = Paths.get("example2", "output.txt");
        output.output(path1.toString());
    }
}

