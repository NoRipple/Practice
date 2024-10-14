package com.example.practiceforsomething.Design.Command;

/**
 * Classname: FanCommand
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:55
 * @Version: v1.0
 */
public class FanCommand implements Command{
    Fan fan;

    public FanCommand() {
        this.fan = new Fan();
    }

    @Override
    public void execute() {
        if (fan.getFanState()){
            fan.off();
        }else {
            fan.on();
        }
    }
}
