package com.students.data;
import com.students.data.dao.StudentDAO;
import com.students.data.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication(scanBasePackages = {"com.students.data"})
public class DataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> { createStudent(studentDAO);

		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student");
		Student tempStudent = new Student("Sai Nandan","Mamidi", "sainandan83@gmail.com");
		//save the student object
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
		//display id of the saved student
		System.out.println("Student id " + tempStudent.getId());
	}
}
