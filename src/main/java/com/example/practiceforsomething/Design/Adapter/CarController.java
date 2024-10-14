package com.example.practiceforsomething.Design.Adapter;

/**
 * Classname: CarController
 * Package: com.example.practiceforsomething.Design.Adapter
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 11:43
 * @Version: v1.0
 */
public abstract class CarController {
    void move() {
        System.out.println("moving");
    }

    ;
    abstract void phonate();
    abstract void twinkle();
}
