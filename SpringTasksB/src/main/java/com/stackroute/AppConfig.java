package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {

    @Bean
    @Scope("prototype")
    public Movie getMovie(){

        Movie movie=new Movie(getActor());
        return movie;
    }

    @Bean
    public Actor getActor(){

        Actor actor=new Actor("Akshay KUmar","Male",50);
        return actor;
    }
}
