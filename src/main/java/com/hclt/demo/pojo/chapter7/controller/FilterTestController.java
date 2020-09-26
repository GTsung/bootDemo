package com.hclt.demo.pojo.chapter7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GTsung
 * @date 2020/9/26
 */
@RestController
@RequestMapping("/fox")
public class FilterTestController {

    @GetMapping("/filter")
    public Object getFilter() {
        return "filter";
    }
}
