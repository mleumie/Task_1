package com.laptanovich.arraytask.service;

import com.laptanovich.arraytask.entity.CustomArray;

import java.util.Optional;

public interface ArrayValueService {
    Optional<Integer> findMax(CustomArray array);

    Optional<Integer> findMin(CustomArray array);

    Optional<Integer> sum(CustomArray array);

    Optional<Double> averageValue(CustomArray array);
}
