package com.laptanovich.arraytask.parser;

import com.laptanovich.arraytask.exception.CustomException;

public interface ArrayParser {
    String SPLIT_ARRAY_REGEX = "\\s*[;,]\\s*";
    int[] parse(String lines) throws CustomException;
}
