package com.example.practiceforsomething.Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Classname: DebugInvocationHandler
 * Package: com.example.practiceforsomething.Proxy.exampleOfJdk
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:48
 * @Version: v1.0
 */
public class DebugInvocationHandler implements InvocationHandler {
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after" + method.getName());
        return result;
    }
}
