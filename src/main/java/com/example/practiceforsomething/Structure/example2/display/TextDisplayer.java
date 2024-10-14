package com.example.practiceforsomething.Structure.example2.display;

import com.example.practiceforsomething.Structure.example2.demo1.Demo1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classname: DetailDisplay
 * Package: com.example.practiceforsomething.Structure.example2.display
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:44
 * @Version: v1.0
 */
public class TextDisplayer {
    public static void showDetail(Integer index) {
        String path = new String("");
        switch (index) {
            case 0:
                path = "D:\\WorkSpace\\practiceForSomething\\src\\main\\java\\com\\example\\practiceforsomething\\Structure\\example2\\mainAndSub.txt";
                break;
            case 1:
                path = "D:\\WorkSpace\\practiceForSomething\\src\\main\\java\\com\\example\\practiceforsomething\\Structure\\example2\\object.txt";
                break;
            case 2:
                path = "D:\\WorkSpace\\practiceForSomething\\src\\main\\java\\com\\example\\practiceforsomething\\Structure\\example2\\event.txt";
                break;
            case 3:
                path = "D:\\WorkSpace\\practiceForSomething\\src\\main\\java\\com\\example\\practiceforsomething\\Structure\\example2\\pipe.txt";
                break;
        }
        show(path);
    }
    public static void show(String path){
        File file = new File(path);
        try (FileReader reader = new FileReader(file)) {
            int content;
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show(){
        File file = new File("D:\\WorkSpace\\practiceForSomething\\src\\main\\java\\com\\example\\practiceforsomething\\Structure\\example2\\output.txt");
        try (FileReader reader = new FileReader(file)) {
            int content;
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
