package com.example.practiceforsomething.Design.Bridge;

/**
 * Classname: Red
 * Package: com.example.practiceforsomething.Design.Bridge
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 12:14
 * @Version: v1.0
 */
public class Red implements Color{
    @Override
    public void getColor() {
        System.out.println("in red");
    }
}
