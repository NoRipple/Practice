package com.example.practiceforsomething.Design.Bridge;

/**
 * Classname: MiddlePen
 * Package: com.example.practiceforsomething.Design.Bridge
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 12:14
 * @Version: v1.0
 */
public class MiddlePen extends Pen{
    @Override
    public void draw() {
        color.getColor();
        System.out.println("draw in middle pen");
    }
}
