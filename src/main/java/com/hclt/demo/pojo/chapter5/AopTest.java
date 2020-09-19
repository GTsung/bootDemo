package com.hclt.demo.pojo.chapter5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/19
 */
@Aspect
@Component
public class AopTest {

    @Pointcut(value = "execution(* com.hclt.demo.pojo.chapter5.*.*(..))")
    public void point() {}


}
