package com.laptanovich.arraytask.parser.impl;

import com.laptanovich.arraytask.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.laptanovich.arraytask.parser.ArrayParser;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {
    public static final Logger logger = LogManager.getLogger();

    @Override
    public int[] parse(String line) throws CustomException {
        if (line == null) {
            throw new CustomException("Input line is null");
        }
        String[] splitArray = line.trim()
                .split(SPLIT_ARRAY_REGEX);
        int[] result = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            try {
                result[i] = Integer.parseInt(splitArray[i].trim());
            } catch (NumberFormatException e) {
                logger.error("Failed to parse: {}", splitArray[i]);
                throw new CustomException("Invalid number:" + splitArray[i], e);
            }
        }
        logger.info("Parsed array: {}", Arrays.toString(result));
        return result;
    }
}
