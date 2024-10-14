package com.example.practiceforsomething.Design.Command;

/**
 * Classname: Fan
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:55
 * @Version: v1.0
 */
public class Fan {
    public boolean fanState = false;
    public void on(){
        fanState = true;
        System.out.println("fan is on");}
    public void off(){
        fanState = false;
        System.out.println("fan is off");
    }

    public boolean getFanState() {
        return fanState;
    }
}
