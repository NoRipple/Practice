package com.example.practiceforsomething.Proxy.CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Classname: DebugMethodInterceptor
 * Package: com.example.practiceforsomething.Proxy.CGLIBProxy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:03
 * @Version: v1.0
 */
public class DebugMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }
}
