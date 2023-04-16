package com.tuto.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.tuto.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.tuto.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS JPA!", "Tutor Awesome"));
        repository.save(new Course(2, "Learn Azure JPA", "Tutor Azul"));
        repository.save(new Course(3, "Learn GCP JPA", "Tutor G"));

        //Add 'l' after int to refer to 'long' type
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn Azure JPA"));
    } 


    //Used previously in JDBC & JPA
    // @Override
    // public void run(String... args) throws Exception {
    //     repository.insert(new Course(1, "Learn AWS JPA!", "Tutor Awesome"));
    //     repository.insert(new Course(2, "Learn Azure JPA", "Tutor Azul"));
    //     repository.insert(new Course(3, "Learn GCP JPA", "Tutor G"));

    //     repository.deleteById(1);

    //     System.out.println(repository.findById(2));
    //     System.out.println(repository.findById(3));
    // } 
}

