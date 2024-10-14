package com.example.practiceforsomething.Design.AbstracFactory;

/**
 * Classname: HairTelevision
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:13
 * @Version: v1.0
 */
public class HairTelevision implements Television{
    @Override
    public void play() {
        System.out.println("HairTV");
    }
}
