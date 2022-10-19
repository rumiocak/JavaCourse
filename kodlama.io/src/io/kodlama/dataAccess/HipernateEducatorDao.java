package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class HipernateEducatorDao extends EducatorDao {

    @Override
    public void add(Base base) {
        System.out.println("Hipernate ile Educator tablosuna veri eklendi.");
    }
}
