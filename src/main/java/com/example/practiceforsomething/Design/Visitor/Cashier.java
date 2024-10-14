package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: Cashier
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:02
 * @Version: v1.0
 */
public class Cashier implements Visitor{
    public void visit(Apple apple){
        System.out.println("apple price");
    }
    public void visit(Book book){
        System.out.println("book price");
    }
}
