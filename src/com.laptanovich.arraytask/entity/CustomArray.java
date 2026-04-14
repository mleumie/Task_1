package com.laptanovich.arraytask.entity;

import com.laptanovich.arraytask.observer.ArrayEventImpl;
import com.laptanovich.arraytask.observer.ArrayObservable;
import com.laptanovich.arraytask.observer.ArrayObserverImpl;

public class CustomArray implements ArrayObservable {
    private int[] array;
    private int id;
    private ArrayObserverImpl observer;

    public CustomArray(int[] array, int id) {
        this.array = array.clone();
        this.id = id;

    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int[] array) {
        this.array = array.clone();
        notifyObserver();
    }

    public int getId() {
        return id;
    }

    public int getElement(int i) {
        return array[i];
    }

    public int getSize() {
        return array.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public void attach(ArrayObserverImpl observer) {
        this.observer = observer;
    }

    @Override
    public void detach(ArrayObserverImpl observer) {
        if (this.observer == observer) {
            this.observer = null;
        }
    }

    @Override
    public void notifyObserver() {
        return observer.actionPerformed(new ArrayEventImpl(this));
    }
}
