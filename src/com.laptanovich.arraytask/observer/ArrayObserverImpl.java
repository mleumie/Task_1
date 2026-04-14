package com.laptanovich.arraytask.observer;

import com.laptanovich.arraytask.entity.ArrayStatistics;
import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.ArrayValueService;
import com.laptanovich.arraytask.service.impl.ArrayValueServiceImpl;
import com.laptanovich.arraytask.warehouse.Warehouse;

public class ArrayObserverImpl implements ArrayObserver {
    @Override
    public void actionPerformed(ArrayEventImpl event) {
        CustomArray array = event.getSource();
        ArrayValueService service = new ArrayValueServiceImpl();
        int min = ArrayValueService.findMin(array);
        int max = ArrayValueService.findMax(array);
        int sum = ArrayValueService.sum(array);
        double average = ArrayValueService.averageValue(array);
        ArrayStatistics statistics = new ArrayStatistics(min, max, sum, average);
        Warehouse.getInstance().put(array.getId(), statistics);
    }
}
