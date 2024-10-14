package com.example.practiceforsomething.Design.Iterater;

/**
 * Classname: Student
 * Package: com.example.practiceforsomething.Design.Iterater
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:19
 * @Version: v1.0
 */
public class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
