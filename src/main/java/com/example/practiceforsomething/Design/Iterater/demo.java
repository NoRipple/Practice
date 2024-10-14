package com.example.practiceforsomething.Design.Iterater;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Iterater
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:19
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        Class aClass = new Class();
        aClass.addStudent(new Student("Aob", 3));
        aClass.addStudent(new Student("Bob", 9));
        aClass.addStudent(new Student("Cob", 1));
        aClass.display();
    }
}
