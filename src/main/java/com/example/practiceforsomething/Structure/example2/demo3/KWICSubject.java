package com.example.practiceforsomething.Structure.example2.demo3;

/**
 * Classname: KWICSubject
 * Package: com.example.practiceforsomething.Structure.example2.demo3
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:56
 * @Version: v1.0
 */
public class KWICSubject extends Subject{
    public void startKWIC(){
        for (int i = 0;i<4;i++){
            super.notifyOneObserver(i);
        }
    }
}

