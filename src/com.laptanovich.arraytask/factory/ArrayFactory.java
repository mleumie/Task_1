package com.laptanovich.arraytask.factory;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.exception.CustomException;

public interface ArrayFactory {
    CustomArray create(String line) throws CustomException;
}
