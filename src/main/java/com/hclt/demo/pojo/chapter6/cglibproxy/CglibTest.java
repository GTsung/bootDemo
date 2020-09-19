package com.hclt.demo.pojo.chapter6.cglibproxy;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(new MeatFactory());
        MeatFactory factory = (MeatFactory) cglibProxy.getProxy();
        factory.create();
    }
}
