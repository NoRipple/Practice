package com.example.practiceforsomething.Proxy.JdkProxy;

import java.lang.reflect.Proxy;

/**
 * Classname: JdkProxyFactory
 * Package: com.example.practiceforsomething.Proxy.exampleOfJdk
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:52
 * @Version: v1.0
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}
