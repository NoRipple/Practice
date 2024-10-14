package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: Product
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:02
 * @Version: v1.0
 */
abstract class Product {
    abstract void accept(Visitor visitor);
}
