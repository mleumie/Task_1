package com.laptanovich.arraytask.warehouse.impl;

import com.laptanovich.arraytask.entity.ArrayStatistics;

import java.util.HashMap;
import java.util.Map;

public class WarehouseImpl implements Warehouse {
    private static WarehouseImpl instance;
    private Map<Integer, ArrayStatistics> stats = new HashMap<>();

    private WarehouseImpl() {}

    public static WarehouseImpl getInstance() {
        if (instance == null) {
            instance = new WarehouseImpl();
        }
        return instance;
    }

    public void put(int id, ArrayStatistics arrayStatistics) {
        stats.put(id, arrayStatistics);
    }

    public ArrayStatistics get(int id) {
        return stats.get(id);
    }
}
