package com.example.practiceforsomething.Design.SimpleFactory;

/**
 * Classname: Robot
 * Package: com.example.practiceforsomething.Design.SimpleFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:14
 * @Version: v1.0
 */
public class Robot implements Person{
    @Override
    public void create() {
        System.out.println("a robot");
    }
}
