package com.example.practiceforsomething.Design.Iterater;

import java.util.*;

/**
 * Classname: Class
 * Package: com.example.practiceforsomething.Design.Iterater
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:18
 * @Version: v1.0
 */
public class Class {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void display(){
        Collections.sort(students, new Com());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}
