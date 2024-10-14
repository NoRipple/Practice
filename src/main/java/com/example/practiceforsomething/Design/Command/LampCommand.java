package com.example.practiceforsomething.Design.Command;

/**
 * Classname: LampCommand
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:55
 * @Version: v1.0
 */
public class LampCommand implements Command
{
    Lamp lamp;

    public LampCommand() {
        this.lamp = new Lamp();
    }

    @Override
    public void execute() {
        if (lamp.getLampState()){
            lamp.off();
        }else {
            lamp.on();
        }
    }
}
