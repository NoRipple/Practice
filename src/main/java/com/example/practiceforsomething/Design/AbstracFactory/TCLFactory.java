package com.example.practiceforsomething.Design.AbstracFactory;

/**
 * Classname: TCLFactory
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:17
 * @Version: v1.0
 */
public class TCLFactory implements Factory{
    @Override
    public Television produceTV() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAir() {
        return new TCLAirConditioner();
    }
}
