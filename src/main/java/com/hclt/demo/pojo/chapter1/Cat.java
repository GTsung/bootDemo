package com.hclt.demo.pojo.chapter1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/17
 */
// @Primary注解表示若存在多个父类型相同的bean，则优先使用此注解的bean
@Primary
@Component
public class Cat implements Animal{
    @Override
    public void use() {
        System.out.println("cat"+Cat.class.getName()+"抓老鼠");
    }
}
