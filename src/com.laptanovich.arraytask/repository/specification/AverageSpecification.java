package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

public class AverageSpecification implements Specification {
    private double average;

    public AverageSpecification(double average) {
        this.average = average;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.average() == average;
    }
}
