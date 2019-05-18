package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    int value = 0;

    public void addObserver(final Observer observer){
        observers.add(observer);
    }

    public void modifyValue(final int change){
        value += change;
        // poinformuj obserwatorów o zmianie  - w Observer musi być metoda update()
        observers.forEach(o -> o.update());
    }

    public int getValue() {
        return value;
    }
}
