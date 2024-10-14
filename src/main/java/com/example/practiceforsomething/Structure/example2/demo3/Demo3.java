package com.example.practiceforsomething.Structure.example2.demo3;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classname: Main
 * Package: com.example.practiceforsomething.Structure.example2.demo3
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:57
 * @Version: v1.0
 */
public class Demo3 {
    public static void play(String path) {
        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input = new Input(path);
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        String path1 = Paths.get("example2", "output.txt").toString();
        Output output = new Output(alphabetizer.getKwicList(), path1);

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();
    }
}

