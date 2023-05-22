package com.students.data.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //It will create single object to Footballcoach and remaining same objects
//will be shared.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// viseversa of singleton
@Component
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice-football";
    }
}
