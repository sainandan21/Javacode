package com.students.data.config;

import com.students.data.common.Coach;
import com.students.data.common.Swimcoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("custom_bean_id") //Take existing third party class and expose as a spring bean
    public Coach swimcoach(){
        return new Swimcoach();
    }

}
