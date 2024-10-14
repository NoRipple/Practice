package com.example.practiceforsomething.Design.Adapter;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Adapter
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 11:49
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        CarController carController;
        carController = new AmbulanceCarAdapter();
        carController.phonate();
        carController.twinkle();
        carController = new PoliceCarAdapter();
        carController.phonate();
        carController.twinkle();
    }
}
