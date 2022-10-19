package io.kodlama.business;

import io.kodlama.core.logging.Logger;
import io.kodlama.dataAccess.EducatorDao;
import io.kodlama.dataAccess.ProductDao;
import io.kodlama.entities.Base;
import io.kodlama.entities.Educator;

public class EducatorManager extends ProductManager {

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers, Educator[] educators) {
        super(educatorDao, loggers);
        this.educators = educators;
    }

    @Override
    public void add(Base base) throws Exception {
        if(base instanceof Educator){
            productDao.add(base);

            for(Logger logger : loggers){
                logger.log(base.getName());
            }
        }
    }
}
