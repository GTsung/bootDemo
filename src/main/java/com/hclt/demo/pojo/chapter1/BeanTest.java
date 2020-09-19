package com.hclt.demo.pojo.chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GTsung
 * @date 2020/9/17
 */
public class BeanTest {

    public static void main(String[] args) {
        // 获取容器AppConfig,AppConfig中的ComponentScan默认扫描所在包的bean
        // 两个bean实现Animal接口，@Autowired按照类型注入，此处无法确定哪一个，
        // 若在其中一个bean中加入@Primary则表示优先使用这个bean
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person person = context.getBean(BusinessPerson.class);
//        person.service();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }
}
