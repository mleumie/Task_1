package com.laptanovich.arraytask.validator;

public interface ArrayValidator {
    String NUMBERS_ARRAY_REGEX = "^[0-9\\s;,\\-]+$";
    boolean isValid(String validString);
}
