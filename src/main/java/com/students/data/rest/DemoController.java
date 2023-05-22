package com.students.data.rest;
import com.students.data.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    Define a private field for the dependency

//    @Autowired -> Field injection (Directly injecting on this with out using constructor or setter)
    private Coach myCoach;
    //private Coach otherCoach;

//    define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    define a setter for dependency injection
    @Autowired
    public void setCoach(@Qualifier("custom_bean_id") Coach theCoach){
        myCoach=theCoach;
        System.out.println("In constructor" + getClass().getSimpleName());
    }

    @GetMapping("/workout/v1")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
