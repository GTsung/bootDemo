package com.hclt.demo.pojo.chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author GTsung
 * @date 2020/9/18
 */
public class YamahaConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String brand = environment.getProperty("guitar.brand");
        return "YAMAHA".equals(brand);
    }
}
