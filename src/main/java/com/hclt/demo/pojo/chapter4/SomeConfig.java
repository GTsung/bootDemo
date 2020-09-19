package com.hclt.demo.pojo.chapter4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author GTsung
 * @date 2020/9/19
 */
@Configuration
//@ImportResource(value = "classpath:xx.xml")
//@PropertySource(value = "classpath:application.properties")
public class SomeConfig {

    // 多环境配置，配置文件可以为idea启动-Dspring.profiles.active=dev
    // java -jar xx.jar --spring.profiles.active=dev 启动某一环境
    // 若无指定哪个环境，可以将配置文件中application.properties配置spring.profiles.active=dev
    // 其余文件为application-dev.properties


    @Bean
    @Profile("dev") // dev环境
    public Some getSome() {
        return new Some("dev");
    }

    @Bean
    @Profile("test")
    public Some getSome2() {
        return new Some("test");
    }
}
