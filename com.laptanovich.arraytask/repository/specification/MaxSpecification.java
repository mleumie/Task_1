package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

public class MaxSpecification implements Specification {
    private int max;

    public MaxSpecification(int max) {
        this.max = max;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.max() == max;
    }
}
