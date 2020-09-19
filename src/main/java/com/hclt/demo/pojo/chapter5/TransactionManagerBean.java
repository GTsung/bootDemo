package com.hclt.demo.pojo.chapter5;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author GTsung
 * @date 2020/9/19
 */
@PropertySource(value = "classpath:application.properties")
@SpringBootApplication
public class TransactionManagerBean {

    // 事务管理器的接口PlatformTransactionManager
    // 依赖为spring-jdbc，则事务管理器为DataSourceTransactionManager
    // 依赖为jpa,则事务管理器为JpaTransactionManager
    // 两个依赖都存在，则需要指定哪个事务管理器

    // 当一个依赖时，springboot默认指定
    @Bean
    public Object object(PlatformTransactionManager transactionManager) {
        System.out.println(transactionManager.getClass().getName());
        return new Object();
    }

    // 自己指定事务管理器
    @Primary // 优先使用
    @Bean(value = "dataTx")
    public PlatformTransactionManager dataManager(DruidDataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }

//    @Bean(value = "jpaTx")
//    public PlatformTransactionManager jpaManager(EntityManagerFactory managerFactory) {
//        return new JpaTransactionManager(managerFactory);
//    }

    public static void main(String[] args) {
        SpringApplication.run(TransactionManagerBean.class, args);
    }


}
