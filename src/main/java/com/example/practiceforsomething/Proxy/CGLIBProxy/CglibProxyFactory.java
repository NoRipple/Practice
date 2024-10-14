package com.example.practiceforsomething.Proxy.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Classname: CglibProxyFactory
 * Package: com.example.practiceforsomething.Proxy.CGLIBProxy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:05
 * @Version: v1.0
 */
public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DebugMethodInterceptor());
        return enhancer.create();
    }
}
