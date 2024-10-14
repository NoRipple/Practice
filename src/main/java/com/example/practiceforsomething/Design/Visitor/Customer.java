package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: Customer
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:01
 * @Version: v1.0
 */
public class Customer implements Visitor{
    public void visit(Apple apple){
        System.out.println("apple");
    }
    public void visit(Book book){
        System.out.println("book");
    }
}
