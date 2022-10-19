package io.kodlama.dataAccess;

import io.kodlama.entities.Base;

public class HipernateCategoryDao extends CategoryDao {

    @Override
    public void add(Base base) {
        System.out.println("Hipernate ile Category tablosuna veri eklendi.");
    }
}
