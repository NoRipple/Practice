package com.example.practiceforsomething.Design.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Classname: ShoppingCart
 * Package: com.example.practiceforsomething.Design.Visitor
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:02
 * @Version: v1.0
 */
public class ShoppingCart {
    private List<Product> list = new ArrayList<Product>();
    public void attach(Product product){
        list.add(product);
    }
    public void detach(Product product){
        list.remove(product);
    }
    public void display(Visitor visitor){
        for (Product o : list) {
            o.accept(visitor);
        }
    }
}
