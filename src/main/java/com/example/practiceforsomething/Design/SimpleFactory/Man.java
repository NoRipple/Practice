package com.example.practiceforsomething.Design.SimpleFactory;

/**
 * Classname: Man
 * Package: com.example.practiceforsomething.Design.SimpleFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:13
 * @Version: v1.0
 */
public class Man implements Person{
    @Override
    public void create() {
        System.out.println("a man");
    }
}
