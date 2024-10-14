package com.example.practiceforsomething.Design.Bridge;

/**
 * Classname: Pen
 * Package: com.example.practiceforsomething.Design.Bridge
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 12:14
 * @Version: v1.0
 */
public abstract class Pen {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
