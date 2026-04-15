package com.laptanovich.arraytask;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.exception.CustomException;
import com.laptanovich.arraytask.factory.ArrayFactory;
import com.laptanovich.arraytask.factory.impl.ArrayFactoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.laptanovich.arraytask.parser.ArrayParser;
import com.laptanovich.arraytask.parser.impl.ArrayParserImpl;
import com.laptanovich.arraytask.reader.ArrayReader;
import com.laptanovich.arraytask.reader.impl.ArrayReaderImpl;
import com.laptanovich.arraytask.service.ArraySortService;
import com.laptanovich.arraytask.service.ArrayValueService;
import com.laptanovich.arraytask.service.impl.ArraySortServiceImpl;
import com.laptanovich.arraytask.service.impl.ArrayValueServiceImpl;
import com.laptanovich.arraytask.validator.ArrayValidator;
import com.laptanovich.arraytask.validator.impl.ArrayValidatorImpl;

import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        ArrayReader reader = new ArrayReaderImpl();
        ArrayValidator validator = new ArrayValidatorImpl();
        ArrayParser parser = new ArrayParserImpl();
        ArrayFactory factory = new ArrayFactoryImpl(parser, validator);
        ArrayValueService valueService = new ArrayValueServiceImpl();
        ArraySortService sortService = new ArraySortServiceImpl();

        List<String> lines;
        lines = reader.read("data/arrays.txt");

        int id = 1;

        for (String line : lines) {
            try {
                CustomArray array = factory.create(line, id);
                id++;
                valueService.findMax(array).ifPresentOrElse(
                        max->logger.info("Max: {}", max),
                        () -> logger.info("Max: empty")
                );

                valueService.findMin(array).ifPresentOrElse(
                        min->logger.info("Min: {}", min),
                        () -> logger.info("Min: empty")
                );

                valueService.sum(array).ifPresentOrElse(
                        sum->logger.info("Sum: {}", sum),
                        () -> logger.info("Sum: empty")
                );

                valueService.averageValue(array).ifPresentOrElse(
                        average->logger.info("Average: {}", average),
                        () -> logger.info("Average: empty")
                );

                CustomArray bubbleSort = new CustomArray(array.getArray(), id);
                sortService.bubbleSort(bubbleSort);
                logger.info("Bubble sorted: {}", bubbleSort);

                CustomArray quickSort = new CustomArray(array.getArray(), id);
                sortService.quickSort(quickSort);
                logger.info("Quick sorted: {}", quickSort);
            } catch (CustomException e) {
                logger.warn("Skip of invalid line: {} {}", line, e.getMessage());
            }
        }

    }
}
