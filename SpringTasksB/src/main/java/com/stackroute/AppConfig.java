package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {

    @Bean
    public Movie getMovie(){

        Movie movie=new Movie();
        return movie;
    }

    @Bean
    public Actor getActor(){

        Actor actor=new Actor("Salman Khan","Male",54);
        return actor;
    }

    @Bean
    public BeanLifecycleDemoBean getBeanLifeCycle(){
        return new BeanLifecycleDemoBean();

    }
}
