package com.hclt.demo.pojo.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GTsung
 * @date 2020/9/18
 */
public class ConditionalTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        // true
        System.out.println(context.containsBean("fender"));
        // false
        System.out.println(context.containsBean("yamaha"));
    }
}
