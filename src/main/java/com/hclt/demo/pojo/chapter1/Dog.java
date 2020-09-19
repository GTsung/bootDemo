package com.hclt.demo.pojo.chapter1;

import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/17
 */
@Component
public class Dog implements Animal{
    public Dog(){
        System.out.println("DOG IS CREATED");
    }
    @Override
    public void use() {
        System.out.println("dog["+ Dog.class.getName()+"]看门用。");
    }
}
