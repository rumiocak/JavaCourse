package io.kodlama.entities;

public class Course extends Base {

    public Course(int id, String name, Educator educator, Category category, double unitPrice) {
        super(id, name);
        this.educator = educator;
        this.category = category;
        this.unitPrice = unitPrice;
    }

}
