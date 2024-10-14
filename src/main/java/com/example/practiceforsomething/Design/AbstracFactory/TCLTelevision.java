package com.example.practiceforsomething.Design.AbstracFactory;

/**
 * Classname: TCLTelevision
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:14
 * @Version: v1.0
 */
public class TCLTelevision implements Television{
    @Override
    public void play() {
        System.out.println("TCL TV");
    }
}
