package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy of Disposable Bean called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterProperties called");
    }

    @PostConstruct
    public void customInit(){

        System.out.println("Init called");
    }

    @PreDestroy
    public void customDestroy(){

        System.out.println("Destroy called");
    }

}
