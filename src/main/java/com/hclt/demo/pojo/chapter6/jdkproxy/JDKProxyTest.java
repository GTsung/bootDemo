package com.hclt.demo.pojo.chapter6.jdkproxy;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        CoatDynamic coatDynamic = new CoatDynamic(new CoatFactoryImpl());
        CoatFactory coatFactory = (CoatFactory) coatDynamic.getProxy();
        coatFactory.makeCoat();
    }
}
