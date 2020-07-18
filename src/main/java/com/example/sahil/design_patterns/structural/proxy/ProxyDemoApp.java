package com.example.sahil.design_patterns.structural.proxy;

import com.example.sahil.design_patterns.structural.proxy.virtual_proxy.ExpensiveObject;
import com.example.sahil.design_patterns.structural.proxy.virtual_proxy.ExpensiveObjectProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(ProxyDemoApp.class, args);
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }

}