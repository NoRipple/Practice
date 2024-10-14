package com.example.practiceforsomething.Design.Adapter;

/**
 * Classname: AmbulanceCarAdapter
 * Package: com.example.practiceforsomething.Design.Adapter
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 11:43
 * @Version: v1.0
 */
public class AmbulanceCarAdapter extends CarController{
    private  AmbulanceLamp lamp;
    private  AmbulanceSound sound;

    public AmbulanceCarAdapter() {
        this.lamp = new AmbulanceLamp();
        this.sound = new AmbulanceSound();
    }

    @Override
    void phonate() {
        sound.sounding();
    }

    @Override
    void twinkle() {
        lamp.lighting();
    }
}
