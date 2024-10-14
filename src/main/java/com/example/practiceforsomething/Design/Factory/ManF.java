package com.example.practiceforsomething.Design.Factory;

/**
 * Classname: ManF
 * Package: com.example.practiceforsomething.Design.Factory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:43
 * @Version: v1.0
 */
public class ManF implements Factory{

    @Override
    public Man produce() {
        System.out.println("a man is building");
        return new Man();
    }
}
