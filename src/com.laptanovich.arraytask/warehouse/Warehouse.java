package com.laptanovich.arraytask.warehouse.impl;

import com.laptanovich.arraytask.entity.ArrayStatistics;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Warehouse instance;
    private Map<Integer, ArrayStatistics> stats = new HashMap<>();

    private Warehouse() {}

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
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
