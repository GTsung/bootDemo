package com.hclt.demo.pojo.chapter6.jdkproxy;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class CoatFactoryImpl implements CoatFactory {
    @Override
    public void makeCoat() {
        System.out.println("专业制作外套");
    }
}
