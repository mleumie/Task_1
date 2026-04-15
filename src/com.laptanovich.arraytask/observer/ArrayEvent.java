package com.laptanovich.arraytask.observer;

import com.laptanovich.arraytask.entity.CustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    public ArrayEvent(CustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
