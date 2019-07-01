package com.mk.lime.provider;

import com.mk.lime.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service(version = "1.0")
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ",nacos";
    }

}
