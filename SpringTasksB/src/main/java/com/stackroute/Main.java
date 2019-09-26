package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1=context.getBean(Movie.class);
        System.out.println("Name of the Actor is "+movie1.getActor1().getName());
        System.out.println("Gender of the Actor is "+movie1.getActor1().getGender());
        System.out.println("Age of the Actor is "+movie1.getActor1().getAge());

        Movie movie2=context.getBean(Movie.class);
        System.out.println(movie1==movie2);    }
    
}
