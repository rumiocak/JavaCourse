package io.kodlama;

import io.kodlama.business.CategoryManager;
import io.kodlama.business.IProductManager;
import io.kodlama.core.logging.DataBaseLogger;
import io.kodlama.core.logging.FileLogger;
import io.kodlama.core.logging.Logger;
import io.kodlama.core.logging.MailLogger;
import io.kodlama.dataAccess.*;
import io.kodlama.entities.Category;
import io.kodlama.entities.Course;
import io.kodlama.entities.Educator;

public class Main {

    public static void main(String[] args) throws Exception{

        //Category, educator ve course tabloları için sanal veri tabanı örneği.
        Category[] categories = {new Category(1, "Programlama")};
        Educator[] educators = {new Educator(1, "Engin Demiroğ")};
        Course[] courses = {
                (new Course(1, "Yazılım Geliştirici Yetiştirme Kampı - JAVA", educators[0], categories[0], 0)),
                (new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", educators[0], categories[0], 0))
        };
        Logger[] loggers = {new FileLogger(), new MailLogger(), new DataBaseLogger()};

        //Veri tabanına veri ekleme + loglama örneği
        IProductManager iProductManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
        iProductManager.add(new Category(2, "Tasarım"));





    }
}
