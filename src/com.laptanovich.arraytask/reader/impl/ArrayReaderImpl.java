package com.laptanovich.arraytask.reader.impl;

import com.laptanovich.arraytask.exception.CustomException;
import com.laptanovich.arraytask.reader.ArrayReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {
    @Override
    public List<String> read(String filePath) throws CustomException {
        try {
            Path path = Path.of(filePath);
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new CustomException("Read error: " + filePath, e);
        }
    }
}
