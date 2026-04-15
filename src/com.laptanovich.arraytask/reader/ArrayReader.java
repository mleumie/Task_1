package com.laptanovich.arraytask.reader;

import com.laptanovich.arraytask.exception.CustomException;

import java.util.List;

public interface ArrayReader {
    List<String> read(String fileName) throws CustomException;
}
