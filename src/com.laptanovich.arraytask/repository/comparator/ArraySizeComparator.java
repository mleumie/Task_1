package com.laptanovich.arraytask.repository.comparator;

import com.laptanovich.arraytask.entity.CustomArray;

import java.util.Comparator;

public class ArraySizeComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return array1.getSize() - array2.getSize();
    }
}
