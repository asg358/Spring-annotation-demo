package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Movie getMovie(){

        Movie movie=new Movie();
        movie.setActor1(getActor());
        return movie;
    }

    @Bean
    public Actor getActor(){

         Actor actor=new Actor();
         actor.setName("Sanjay Dutt");
         actor.setGender("Male");
         actor.setAge(52);
         return actor;
    }

}
