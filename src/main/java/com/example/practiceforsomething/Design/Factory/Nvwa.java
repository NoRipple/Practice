package com.example.practiceforsomething.Design.Factory;

import com.example.practiceforsomething.Design.SimpleFactory.Man;
import com.example.practiceforsomething.Design.SimpleFactory.Robot;
import com.example.practiceforsomething.Design.SimpleFactory.Women;

import java.util.Scanner;

/**
 * Classname: Nvwa
 * Package: com.example.practiceforsomething.Design.Factory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:48
 * @Version: v1.0
 */
public class Nvwa {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("please enter the type:");
        String s = type.nextLine();
        Factory factory = null;
        if (s.equals("M")) factory = new ManF();
        else if (s.equals("W")) factory = new WomenF();
        else if (s.equals("R")) factory = new RobotF();
        Person person = factory.produce();
        person.create();
    }
}
