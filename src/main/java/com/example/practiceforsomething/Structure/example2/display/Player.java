package com.example.practiceforsomething.Structure.example2.display;

import com.example.practiceforsomething.Structure.example2.demo1.Demo1;
import com.example.practiceforsomething.Structure.example2.demo2.Demo2;
import com.example.practiceforsomething.Structure.example2.demo3.Demo3;
import com.example.practiceforsomething.Structure.example2.demo4.Demo4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classname: Adapter
 * Package: com.example.practiceforsomething.Structure.example2.display
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:22
 * @Version: v1.0
 */
public class Player {
    public static void play(Integer index, String path) throws IOException {

        switch (index) {
            case 0:
                Demo1.play(path);
                break;
            case 1:
                Demo2.play(path);
                break;
            case 2:
                Demo3.play(path);
                break;
            case 3:
                Demo4.play(path);
                break;
        }
        TextDisplayer.show();
    }
}
