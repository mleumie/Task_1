package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

public class SumSpecification implements Specification {
    private int sum;

    public SumSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.sum() == sum;
    }
}
