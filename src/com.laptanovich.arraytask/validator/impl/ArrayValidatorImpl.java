package com.laptanovich.arraytask.validator.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.laptanovich.arraytask.validator.ArrayValidator;

public class ArrayValidatorImpl implements ArrayValidator {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public boolean isValid(String validString) {
        boolean matches = validString.matches(NUMBERS_ARRAY_REGEX);
        logger.info(validString + "isValid" + matches);
        return matches;
    }
}
