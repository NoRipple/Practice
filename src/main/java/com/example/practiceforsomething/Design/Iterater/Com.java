package com.example.practiceforsomething.Design.Iterater;

import java.util.Comparator;

/**
 * Classname: Com
 * Package: com.example.practiceforsomething.Design.Iterater
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:42
 * @Version: v1.0
 */
public class Com implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student)o1;
        Student student2 = (Student)o2;
        return student1.getAge().compareTo(student2.getAge());
    }
}
