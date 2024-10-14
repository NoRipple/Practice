package com.example.practiceforsomething.Design.Command;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Command
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:06
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        Button button = new Button();
        button.setCommand(new FanCommand());
        button.touch();
        button.touch();
        button.setCommand(new LampCommand());
        button.touch();
        button.touch();
    }
}
