package com.example.practiceforsomething.Design.Command;

/**
 * Classname: Lamp
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:55
 * @Version: v1.0
 */
public class Lamp {
    public boolean lampState = false;
    public void on(){
        lampState = true;
        System.out.println("lamp is on");}
    public void off(){
        lampState = false;
        System.out.println("lamp is off");
    }

    public boolean getLampState() {
        return lampState;
    }
}
