package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class JdbcEducatorDao extends EducatorDao {

    @Override
    public void add(Base base) {
        System.out.println("JDBC ile Educator tablosuna veri eklendi.");
    }
}
