package com.example.practiceforsomething.Proxy.JdkProxy;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Proxy.exampleOfJdk
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:56
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) {
        SmsService proxy = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxy.send("java");
    }
}
