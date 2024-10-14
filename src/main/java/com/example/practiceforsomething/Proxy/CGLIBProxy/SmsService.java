package com.example.practiceforsomething.Proxy.CGLIBProxy;

/**
 * Classname: SmsService
 * Package: com.example.practiceforsomething.Proxy.CGLIBProxy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:01
 * @Version: v1.0
 */
public class SmsService {
    public String send (String msg) {
        System.out.println(msg);
        return msg;
    }
}
