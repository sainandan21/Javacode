package com.students.data.dao;

import com.students.data.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//Implementing DAO

@Repository
public class StudentDAOimp implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;
    //inject entity manager using constructor injection

    @Autowired
    public StudentDAOimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
