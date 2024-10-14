package com.example.practiceforsomething.Design.Visitor;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:14
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.attach(new Apple());
        shoppingCart.attach(new Book());
        shoppingCart.display(new Cashier());
        shoppingCart.display(new Customer());
    }
}
