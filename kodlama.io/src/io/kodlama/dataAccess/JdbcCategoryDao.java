package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class JdbcCategoryDao extends CategoryDao {

    @Override
    public void add(Base base) {
        System.out.println("JDBC ile Category tablosuna veri eklendi.");
    }
}
