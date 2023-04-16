package com.tuto.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.tuto.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
 
    @PersistenceContext //Better than using @Autowired bcz
    //it expresses a dependency on a container-managed

    //Make use of JPA to interact with DB through EntityManager
    private EntityManager entityManager;

    public void insert(Course course) { //handles the mapping
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
