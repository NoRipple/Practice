package com.example.practiceforsomething.Design.SimpleFactory;

/**
 * Classname: Nvwa
 * Package: com.example.practiceforsomething.Design.SimpleFactory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:14
 * @Version: v1.0
 */
public class Nvwa {
    public static Person getPerson(String type) {
        if (type.equals("M")) return new Man();
        else if (type.equals("W")) return new Women();
        else if (type.equals("R")) return new Robot();
        else return null;
    }
}
