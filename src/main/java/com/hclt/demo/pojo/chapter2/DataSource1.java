package com.hclt.demo.pojo.chapter2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author GTsung
 * @date 2020/9/18
 */
// 一种读取配置文件的方式@Value
@Configuration
public class DataSource1 {

    @Value(value = "${spring.datasource.driver-class-name}")
    private String driverClass;

    @Value(value = "${spring.datasource.url}")
    private String url;

    @Value(value = "${spring.datasource.username}")
    private String username;

    @Value(value = "${spring.datasource.password}")
    private String password;

}
