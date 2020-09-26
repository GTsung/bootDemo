package com.hclt.demo.pojo.chapter7.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GTsung
 * @date 2020/9/26
 */
@Configuration
public class FilterConfiguration {

    // 配置过滤器
    @Bean
    public FilterRegistrationBean registerBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new LoginFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("LoginFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
