package com.laptanovich.arraytask.observer;

import com.laptanovich.arraytask.entity.CustomArray;

public interface ArrayObservable {
    void attach(ArrayObserverImpl observer);

    void detach(ArrayObserverImpl observer);

    void notifyObserver();
}
