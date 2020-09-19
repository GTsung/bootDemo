package com.hclt.demo.pojo.chapter3;

import org.springframework.context.annotation.*;

/**
 * @author GTsung
 * @date 2020/9/18
 */
// 按照条件装配Conditional注解需要一个实现Condition接口的类，
// 其中的matches方法决定是否装配bean
@Configuration
// 导入配置文件
@PropertySource(value = "classpath:application.properties",
        ignoreResourceNotFound = true)
public class BeanConfig {

    @Bean
    @Conditional(value = FenderConditional.class)
    public Guitar fender() {
        return new Guitar("fender");
    }

    @Bean
    @Conditional(value = YamahaConditional.class)
    public Guitar yamaha() {
        return new Guitar("YAMAHA");
    }
}
