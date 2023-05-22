package com.students.data.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Swimcoach implements Coach{

    public Swimcoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Swimming for 35";
    }

}
