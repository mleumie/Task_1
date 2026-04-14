package com.laptanovich.arraytask.observer;

import com.laptanovich.arraytask.entity.CustomArray;

public interface ArrayEvent {
    public void ArrayEventImpl(CustomArray source);

    public CustomArray getSource();
}
