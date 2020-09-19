package com.hclt.demo.pojo.chapter5;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author GTsung
 * @date 2020/9/19
 */
@Service
public class TransactionService {

    // 当指定多个事务管理器时，此处应该声明使用哪个
    @Transactional(transactionManager = "jpaTx")
    public String getStr() {
        return "s";
    }

}
