package io.kodlama.business;

import io.kodlama.core.logging.Logger;
import io.kodlama.dataAccess.CourseDao;
import io.kodlama.dataAccess.ProductDao;
import io.kodlama.entities.Base;
import io.kodlama.entities.Course;


public class CourseManager extends ProductManager{

    public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
        super(courseDao, loggers);
        this.courses = courses;
    }

    @Override
    public void add(Base base) throws Exception {

        for(Course course : courses) {
            if (base.getName().equals(course.getName())) {
                throw new Exception("Aynı isimle kurs olamaz.");
            }
        }

        if (base.getUnitPrice() < 0) {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }


        productDao.add(base);

        for(Logger logger : loggers){
            logger.log(base.getName());
        }
    }
}

