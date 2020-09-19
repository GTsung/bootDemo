package com.hclt.demo.pojo.chapter1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GTsung
 * @date 2020/9/17
 */
// lazyInit延迟依赖注入，当真正使用时才创建注入
//@ComponentScan(basePackages = "com.hclt.demo.pojo.chapter1", lazyInit = true)
@ComponentScan
@Configuration
public class AppConfig {
}
