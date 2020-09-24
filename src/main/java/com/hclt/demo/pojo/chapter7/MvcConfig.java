package com.hclt.demo.pojo.chapter7;

import com.hclt.demo.pojo.chapter7.intercepters.MyIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


/**
 * @author GTsung
 * @date 2020/9/24
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new MyIntercepter());
        registration.addPathPatterns("/test/*");
    }
}
