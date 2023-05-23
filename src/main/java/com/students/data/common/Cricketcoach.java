package com.students.data.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //marks the class as a spring bean
//@Lazy //it will not create any beans until we tell to the democontroller.
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Cricketcoach implements Coach {

    public Cricketcoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
       return "Practice fast-...bowling till today afternoon";

    }

//    define our init method
    @PostConstruct //Setting up handles to resources(db,sockets, files, etc)
    public void Startconstructor(){
        System.out.println("Start "+ getClass().getSimpleName());
    }

//    define our destroy method
    @PreDestroy //Clean up handles to resources(db, sockets, files, etc)
    public void Cleanupstuff(){
        System.out.println("Destroy "+ getClass().getSimpleName());
    }


}
