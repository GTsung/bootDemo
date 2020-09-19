package com.hclt.demo.pojo.chapter1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/18
 */
// BeanPostProcessor后处理器，对所有bean起作用
@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    // 在自定义初始化方法@PostConstruct之后调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用postProcessBeforeInitialization方法，参数["
                + bean.getClass().getName() + "][" + beanName + "]");
        return bean;
    }

    // 在InitializingBean的afterPropertiesSet方法后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用postProcessAfterInitialization方法，参数["
                + bean.getClass().getName() + "][" + beanName + "]");
        return bean;
    }
}
