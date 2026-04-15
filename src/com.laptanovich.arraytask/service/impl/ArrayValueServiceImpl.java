package com.laptanovich.arraytask.service.impl;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.ArrayValueService;

import java.util.Optional;

public class ArrayValueServiceImpl implements ArrayValueService {
    @Override
    public Optional<Integer> findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) {
            return Optional.empty();
        }
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }

    @Override
    public Optional<Integer> findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) {
            return Optional.empty();
        }
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return Optional.of(min);
    }

    @Override
    public Optional<Integer> sum(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return Optional.of(sum);
    }

    @Override
    public Optional<Double> averageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) {
            return Optional.empty();
        }
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;
        return Optional.of(average);
    }
}
