package com.example.practiceforsomething.Design.AbstracFactory;

/**
 * Classname: HairFactory
 * Package: com.example.practiceforsomething.Design.AbstracFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:17
 * @Version: v1.0
 */
public class HairFactory implements Factory{
    @Override
    public Television produceTV() {
        return new HairTelevision();
    }

    @Override
    public AirConditioner produceAir() {
        return new HairAirConditioner();
    }
}
