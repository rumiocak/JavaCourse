package io.kodlama.business;

import io.kodlama.core.logging.Logger;
import io.kodlama.dataAccess.ProductDao;
import io.kodlama.entities.Category;
import io.kodlama.entities.Course;
import io.kodlama.entities.Educator;

public abstract class ProductManager implements IProductManager {

    protected ProductDao productDao;
    protected Logger[] loggers;
    protected Educator[] educators;
    protected Category[] categories;
    protected Course[] courses;


    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

}
