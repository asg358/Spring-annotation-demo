package com.stackroute.domain;

import com.stackroute.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware, ApplicationContextAware, BeanFactoryAware
{
    @Autowired
    private Actor actor1;

    public Movie() {
    }

    public Movie(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor1() {

        return actor1;
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware Implemented");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware Implemented " + "and Bean Name is"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware Implemented");
    }
}
