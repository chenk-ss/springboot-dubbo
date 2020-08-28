package com.chenk.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.HelloService;

/**
 * @Author chenk
 * @create 2020/8/28 17:02
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
