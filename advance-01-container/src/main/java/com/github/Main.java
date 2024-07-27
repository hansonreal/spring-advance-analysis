package com.github;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * BeanFactory 与 ApplicationContext区别
 */
@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        /**
         * 1、什么是BeanFactory
         * a、BeanFactory 是 ApplicationContext的父接口
         * b、BeanFactory 是 Spring 的核心容器，主要的 ApplicationContext 的实现，都组合了 BeanFactory 的功能
         */


        // ctrl + alt + u 查看类图
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        // ctrl + alt + b 查看方法
        context.getBean("aaaa");


        /**
         * BeanFactory 能干点啥
         * 1、表面只有 getBean 方法
         * 2、实际上控制反转、基本的依赖注入 以及 Bean 生命周期的各种功能 都由 BeanFactory 的实现类提供
         */


    }
}
