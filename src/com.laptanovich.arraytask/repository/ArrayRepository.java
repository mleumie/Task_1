package com.laptanovich.arraytask.repository;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.repository.specification.Specification;
import com.laptanovich.arraytask.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {
    public static final Logger logger = LogManager.getLogger();
    private static ArrayRepository instance;

    private final List<CustomArray> arrays = new ArrayList<>();

    private ArrayRepository() {}

    public static ArrayRepository getInstance() {
        if(instance == null) {
            instance = new ArrayRepository();
        }
            return instance;
    }

    public void add(CustomArray customArray) {
        logger.info("Custom array added, id: {}", customArray.getId());
        arrays.add(customArray);
    }

    public void remove(CustomArray customArray) {
        logger.info("Custom array removed, id: {}", customArray.getId());
        Warehouse.getInstance().removeArrayStats(customArray.getId());
        arrays.remove(customArray);
    }

    public List<CustomArray> sort(Comparator<? super CustomArray> comparator) {
        logger.info("Custom array sorted");
        return arrays.stream()
                .sorted(comparator)
                .toList();
    }

    public List<CustomArray> query(Specification specification) {
        logger.info("Custom array queried");
        List<CustomArray> result = new ArrayList<>();
        for(CustomArray array : arrays) {
            if(specification.specify(array)) {
                result.add(array);
            }
        }
        return result;
    }

}
