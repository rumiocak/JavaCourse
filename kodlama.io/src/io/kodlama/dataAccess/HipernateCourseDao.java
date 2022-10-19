package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class HipernateCourseDao extends CourseDao {

    @Override
    public void add(Base base) {
        System.out.println("Hipernate ile Course tablosuna veri eklendi.");
    }
}
