package com.laptanovich.arraytask.repository.comparator;

import com.laptanovich.arraytask.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return array1.getId() - array2.getId();
    }
}
