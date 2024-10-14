package com.example.practiceforsomething.Proxy.JdkProxy;

/**
 * Classname: SmsServiceImpl
 * Package: com.example.practiceforsomething.Proxy.exampleOfJdk
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:47
 * @Version: v1.0
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message");
        return message;
    }
}
