package com.example.practiceforsomething.Structure.example2.display;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classname: Main
 * Package: com.example.practiceforsomething.Structure.example2.display
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:48
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件地址：");
        String path = scanner.nextLine();
        System.out.println("请选择处理方式:");
        System.out.println("0:主程序-子程序");
        System.out.println("1:面向对象");
        System.out.println("2:事件系统");
        System.out.println("3:管道过滤");
        int index = scanner.nextInt();
        Player.play(index, path);
        TextDisplayer.showDetail(index);
    }
}
