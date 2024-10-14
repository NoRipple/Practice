package com.example.practiceforsomething.Design.Adapter;

/**
 * Classname: PoliceCarAdapter
 * Package: com.example.practiceforsomething.Design.Adapter
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 11:54
 * @Version: v1.0
 */
public class PoliceCarAdapter extends CarController{
    private PoliceLamp lamp;
    private PoliceSound sound;

    public PoliceCarAdapter() {
        lamp = new PoliceLamp();
        sound = new PoliceSound();
    }

    @Override
    void phonate() {
        sound.alarmSound();
    }

    @Override
    void twinkle() {
        lamp.alarmLamp();
    }
}
