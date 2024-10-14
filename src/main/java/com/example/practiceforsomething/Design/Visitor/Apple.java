package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: Apple
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:01
 * @Version: v1.0
 */
public class Apple extends Product{
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
