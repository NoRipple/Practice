package com.example.practiceforsomething.Design.Factory;

/**
 * Classname: WomenF
 * Package: com.example.practiceforsomething.Design.Factory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:45
 * @Version: v1.0
 */
public class WomenF implements Factory{
    @Override
    public Women produce() {
        System.out.println("a women is building");
        return new Women();
    }
}
