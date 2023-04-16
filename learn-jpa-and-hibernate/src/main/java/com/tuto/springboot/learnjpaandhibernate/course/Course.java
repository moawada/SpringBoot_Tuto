package com.tuto.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name="Course_Details") //Defines different name for Bean & table
public class Course {

    @Id //Defines 'id' as a primary key of a table
    private long id;

   // @Column(name="name") //Maps 'name' to a field in table called 'name'
   // Since they have the same name, we can remove this annotation.
   // Mapping will be done automatically.
    private String name;

    private String author;

    //No args Constructor
    public Course() {
    }

    //3 args Constructor
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //toString
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
