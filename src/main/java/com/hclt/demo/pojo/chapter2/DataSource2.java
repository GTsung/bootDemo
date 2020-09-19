package com.hclt.demo.pojo.chapter2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/18
 */
@Component
@ConfigurationProperties(value = "druid")
public class DataSource2 {

    private int maxActive;
    private int initialSize;
    private int maxWait;
    private int minIdle;
    private int maxIdle;

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }
}
