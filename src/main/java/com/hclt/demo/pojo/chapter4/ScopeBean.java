package com.hclt.demo.pojo.chapter4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author GTsung
 * @date 2020/9/19
 */
// 单态、原型、session、application、request
@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class ScopeBean {
}
