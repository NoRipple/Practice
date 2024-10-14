package com.example.practiceforsomething.Design.AbstracFactory;

import java.util.Scanner;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:24
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter factory");
        String line = scanner.nextLine();
        Factory factory = null;
        if (line.equals("H")) factory = new HairFactory();
        else if (line.equals("T")) factory = new TCLFactory();
        AirConditioner airConditioner = factory.produceAir();
        Television television = factory.produceTV();
        airConditioner.changeTem();
        television.play();
    }
}
