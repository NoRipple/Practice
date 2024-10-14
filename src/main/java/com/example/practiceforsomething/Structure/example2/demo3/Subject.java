package com.example.practiceforsomething.Structure.example2.demo3;

import java.util.LinkedList;
import java.util.List;

/**
 * Classname: Subject
 * Package: com.example.practiceforsomething.Structure.example2.demo3
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:55
 * @Version: v1.0
 */
public class Subject {

    //观察者数组
    private List<com.example.practiceforsomething.Structure.example2.demo3.Observer> vector = new LinkedList<>();


    //增加一个观察者
    public void addObserver(Observer observer) {
        vector.add(observer);
    }

//    //删除一个观察者
//    public void deleteObserver(Observer observer) {
//        vector.remove(observer);
//    }
//
//    //通知所有观察者
//    public void notifyAllObserver() {
//        for(observer : vector ) {
//            observer.toString();
//        }
//    }

    // 通知特定观察者
    public void notifyOneObserver(int i) {
        vector.get(i).toDo();
    }

}
