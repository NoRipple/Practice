package com.example.practiceforsomething.Design.SimpleFactory;

import java.util.Scanner;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.SimpleFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:17
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("please enter the type:");
        String s = type.nextLine();
        Person person = Nvwa.getPerson(s);
        person.create();
    }
}
