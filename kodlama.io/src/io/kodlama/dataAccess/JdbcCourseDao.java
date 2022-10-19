package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class JdbcCourseDao extends CourseDao {

    @Override
    public void add(Base base) {
        System.out.println("JDBC ile Course tablosuna veri eklendi.");
    }
}
