package com.hclt.demo.pojo.chapter1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author GTsung
 * @date 2020/9/17
 */
// 加入生命周期接口和自定义,实现所有bean可以实现的接口
@Component
public class BusinessPerson2 implements Person, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    // @Qualifier与@Autowired同时使用表示按照name注入
//    @Autowired
//    @Qualifier(value = "dog")
    private Animal animal;

    // 构造方法注入
//    public BusinessPerson(@Autowired @Qualifier(value = "dog")Animal animal) {
//        this.animal = animal;
//    }

    @Override
    public void service() {
        animal.use();
    }

    @Override
    @Autowired
    @Qualifier(value = "dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟创建依赖");
        this.animal = animal;
    }

    // BeanNameAware --->1
    @Override
    public void setBeanName(String name) {
        System.out.println("[" + this.getClass().getName()+ "]调用BeanNameAware的setBeanName.");
    }

    // BeanFactoryAware方法 --->2
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[" + this.getClass().getName()+ "]调用BeanFactoryAware的setBeanFactory.");
    }

    // ApplicationContextAware --->3
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[" + this.getClass().getName()+ "]调用ApplicationContextAware的setApplicationContext.");
    }

    // 自定义的初始化方法,调用完通用的postProcessBeforeInitialization后调用自定义初始化方法--->5
    @PostConstruct
    public void init() {
        System.out.println("[" + this.getClass().getName() + "]调用@PostConstruct注解的初始化方法.");
    }

    // InitializingBean  --->6 之后调用通用处理器的postProcessAfterInitialization
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[" + this.getClass().getName()+ "]调用InitializingBean的afterPropertiesSet.");
    }

    // 调用自定义销毁 ---->8
    @PreDestroy
    public void destory1() {
        System.out.println("[" + this.getClass().getName() + "]调用@PreDestroy注解的销毁方法.");
    }

    // DisposableBean --->9
    @Override
    public void destroy() throws Exception {
        System.out.println("[" + this.getClass().getName()+ "]调用DisposableBean的destroy.");
    }

}