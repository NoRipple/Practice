package com.example.practiceforsomething.Design.Command;

/**
 * Classname: Button
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:58
 * @Version: v1.0
 */
public class Button {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void touch() {
        System.out.println("touch button");
        command.execute();
    }
}
