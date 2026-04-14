package com.laptanovich.arraytask.factory.impl;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.exception.CustomException;
import com.laptanovich.arraytask.factory.ArrayFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.laptanovich.arraytask.parser.ArrayParser;
import com.laptanovich.arraytask.validator.ArrayValidator;

public class ArrayFactoryImpl implements ArrayFactory {
    private static final Logger logger = LogManager.getLogger();
    private final ArrayParser parser;
    private final ArrayValidator validator;

    public ArrayFactoryImpl(ArrayParser parser, ArrayValidator validator) {
        this.parser = parser;
        this.validator = validator;
    }

    @Override
    public CustomArray create(String line) throws CustomException {
        if (!validator.isValid(line)) {
            logger.warn("Validation failed from: {}", line);
            throw new CustomException("Invalid line: " + line);
        }
        int[] array = parser.parse(line);
        return new CustomArray(array, id);
    }
}
