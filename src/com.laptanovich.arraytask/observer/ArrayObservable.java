package com.laptanovich.arraytask.observer;

import com.laptanovich.arraytask.observer.impl.ArrayObserverImpl;

public interface ArrayObservable {
    void attach(ArrayObserver observer);

    void detach(ArrayObserver observer);

    void notifyObserver();
}
