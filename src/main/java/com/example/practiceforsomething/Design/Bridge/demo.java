package com.example.practiceforsomething.Design.Bridge;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Bridge
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 12:21
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        Pen pen;
        pen = new MiddlePen();
        pen.setColor(new Red());
        pen.draw();
        pen = new SmallPen();
        pen.setColor(new Green());
        pen.draw();
    }
}
