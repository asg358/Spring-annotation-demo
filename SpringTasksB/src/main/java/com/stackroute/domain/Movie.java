package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    private Actor actor1;

    public Movie() {
    }

    public Movie(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor1() {

        return actor1;
    }


}
