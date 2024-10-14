package com.example.practiceforsomething.Design.Factory;

/**
 * Classname: RobotF
 * Package: com.example.practiceforsomething.Design.Factory
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:45
 * @Version: v1.0
 */
public class RobotF implements Factory{
    @Override
    public Person produce() {
        System.out.println("a robot is building");
        return new Robot();
    }
}
