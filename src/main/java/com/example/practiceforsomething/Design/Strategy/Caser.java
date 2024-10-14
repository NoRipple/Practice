package com.example.practiceforsomething.Design.Strategy;

/**
 * Classname: Caser
 * Package: com.example.practiceforsomething.Design.Strategy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:29
 * @Version: v1.0
 */
public class Caser implements Encrypt{
    @Override
    public void work() {
        System.out.println("使用凯撒加密");
    }
}
