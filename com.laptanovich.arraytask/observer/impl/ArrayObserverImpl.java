package com.laptanovich.arraytask.observer.impl;

import com.laptanovich.arraytask.entity.ArrayStatistics;
import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.observer.ArrayEvent;
import com.laptanovich.arraytask.observer.ArrayObserver;
import com.laptanovich.arraytask.service.ArrayValueService;
import com.laptanovich.arraytask.warehouse.impl.WarehouseImpl;

public class ArrayObserverImpl implements ArrayObserver {
    @Override
    public void actionPerformed(ArrayEvent event) {
        CustomArray array = event.getSource();
        int min = ArrayValueService.findMin(array);
        int max = ArrayValueService.findMax(array);
        int sum = ArrayValueService.sum(array);
        double average = ArrayValueService.averageValue(array);
        ArrayStatistics statistics = new ArrayStatistics(min, max, sum, average);
        WarehouseImpl.getInstance().put(array.getId(), statistics);
    }
}
