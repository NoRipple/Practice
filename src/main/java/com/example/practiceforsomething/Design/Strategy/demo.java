package com.example.practiceforsomething.Design.Strategy;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Strategy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:30
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        String password = new String("111111");
        Strategy strategy = new Strategy();
        strategy.setEncrypt(new MD5());
        strategy.work(password);
        System.out.println("更换加密方式");
        strategy.setEncrypt(new Caser());
        strategy.work(password);
    }
}
