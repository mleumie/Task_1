package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

public class IdSpecification implements Specification {
    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getId() == id;
    }
}
