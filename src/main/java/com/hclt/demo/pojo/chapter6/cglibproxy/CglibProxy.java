package com.hclt.demo.pojo.chapter6.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    private void doSomeAfter() {
        System.out.println("cglib after");
    }

    private void doSomeBefore() {
        System.out.println("cglib before");
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        doSomeBefore();
        Object obj = methodProxy.invokeSuper(proxy, args);
//        Object obj = method.invoke(target, args);
        doSomeAfter();
        return obj;
    }

    public Object getProxy(){
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数，此处的回调函数指实现MethodInterceptor接口的类
        // enhancer.setCallback(MethodInterceptor)
        enhancer.setCallback(this);
        // 创建代理
        return enhancer.create();
    }
}
