package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: Visitor
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:02
 * @Version: v1.0
 */
public interface Visitor {
    void visit(Apple apple);
    void visit(Book book);
}
