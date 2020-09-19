package com.hclt.demo.pojo.chapter6.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class CoatDynamic {

    // 目标类
    private Object factory;

    public CoatDynamic(Object factory) {
        this.factory = factory;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        doSomeBefore();
                        Object obj = method.invoke(factory, args);
                        doSomeAfter();
                        return obj;
                    }

                    private void doSomeAfter() {
                        System.out.println("jdk after");
                    }

                    private void doSomeBefore() {
                        System.out.println("jdk before");
                    }
                });
    }

}
