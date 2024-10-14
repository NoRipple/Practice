package com.example.practiceforsomething.Design.AbstracFactory;

/**
 * Classname: HairAirConditioner
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:14
 * @Version: v1.0
 */
public class HairAirConditioner implements  AirConditioner{
    @Override
    public void changeTem() {
        System.out.println("HairAir");
    }
}
