package com.laptanovich.arraytask.service;

import com.laptanovich.arraytask.entity.CustomArray;

public interface ArraySortService {
    void bubbleSort(CustomArray array);

    void quickSort(CustomArray array);
}
