package io.kodlama.business;

import io.kodlama.core.logging.Logger;
import io.kodlama.dataAccess.CategoryDao;
import io.kodlama.dataAccess.ProductDao;
import io.kodlama.entities.Base;
import io.kodlama.entities.Category;


public class CategoryManager extends ProductManager{

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        super(categoryDao, loggers);
        this.categories = categories;
    }

    @Override
    public void add(Base base) throws Exception {
        if(base instanceof Category){
            for(Category category : categories){
                if(base.getName().equals(category.getName())){
                    throw new Exception("Aynı isimle kategori olamaz.");
                }
            }
            productDao.add(base);

            for(Logger logger : loggers){
                logger.log(base.getName());
            }
        }
    }
}
