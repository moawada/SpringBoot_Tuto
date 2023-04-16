package com.tuto.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tuto.springboot.learnjpaandhibernate.course.Course;

//Interacts with database
@Repository 
public class CourseJdbcRepository {

    @Autowired
    //Fire queries using springjdbc
    private JdbcTemplate springJdbcTemplate;   

    private static String INSERT_QUERY =
        """
            insert into course (id, name, author)
            values(?,?,?);          
        """;

    private static String DELETE_QUERY =
        """
            delete from course 
            where id = ?          
        """;

    private static String SELECT_QUERY =
        """
            select * from course 
            where id = ?          
        """;

    public void insert(Course course) {
        //get them in same order as '?' in INSERT_QUERY
        springJdbcTemplate.update(INSERT_QUERY, 
            course.getId(), 
            course.getName(), 
            course.getAuthor());
    }

    public void deleteById(long id) {
        //get id as '?' in DELETE_QUERY
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        //ResultSet -> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SELECT_QUERY, 
            new BeanPropertyRowMapper<>(Course.class), id);
        //ResultSet -> Bean (mapping) => Row Mapper (they help mapping into specific Bean)
    }
}
