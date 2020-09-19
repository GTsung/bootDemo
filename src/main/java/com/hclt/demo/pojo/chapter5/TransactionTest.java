package com.hclt.demo.pojo.chapter5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GTsung
 * @date 2020/9/19
 */
public class TransactionTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionManagerBean.class);

    }
}
