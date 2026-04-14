package com.laptanovich.arraytask.entity;

//The compiler automatically creates private final fields,
// a canonical constructor, public accessor methods, equals(),
// hashCode(), and toString().
public record ArrayStatistics(
        int min,
        int max,
        int sum,
        double average) {
}
