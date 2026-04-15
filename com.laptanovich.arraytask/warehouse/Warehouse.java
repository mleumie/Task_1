package com.laptanovich.arraytask.warehouse;

import com.laptanovich.arraytask.entity.ArrayStatistics;
import com.laptanovich.arraytask.warehouse.impl.WarehouseImpl;

public interface Warehouse {
    public static WarehouseImpl getInstance() {
    }

    public void put(int id, ArrayStatistics arrayStatistics);

    public ArrayStatistics get(int id);

}
