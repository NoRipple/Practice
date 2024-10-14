package com.example.practiceforsomething.Proxy.CGLIBProxy;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Proxy.CGLIBProxy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:08
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        SmsService proxy = (SmsService) CglibProxyFactory.getProxy(SmsService.class);
        proxy.send("cglib");
    }

}
