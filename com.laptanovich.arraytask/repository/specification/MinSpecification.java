package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

public class MinSpecification implements Specification {
    public int min;

    public MinSpecification(int min) {
        this.min = min;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.min() == min;
    }
}
