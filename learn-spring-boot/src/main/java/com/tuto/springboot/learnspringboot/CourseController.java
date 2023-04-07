package com.tuto.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    //Create a list of courses
    //Map a URL to this method with @RequestMapping 
    //Displays courses in /courses URL
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn AWS", "tuto"),
            new Course(2, "Learn DevOps", "tuto")
        );
    }

}
