package com.laptanovich.arraytask.repository.specification;

import com.laptanovich.arraytask.entity.CustomArray;

@FunctionalInterface
public interface Specification {
    boolean specify(CustomArray array);
}
