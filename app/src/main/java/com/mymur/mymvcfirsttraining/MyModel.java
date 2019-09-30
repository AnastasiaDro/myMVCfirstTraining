package com.mymur.mymvcfirsttraining;

//Класс будет как Модель данных

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyModel implements Observable {

    private List <Observer> observers;
    private String enteredText;


    //в конструкторе создаем новый список наблюдателей
    public MyModel() {
        observers = new LinkedList();
    }

    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer newObserver) {
        observers.remove(newObserver);
    }

    //метод обновляет данные методом "updateData" из класса-наблюдателя CurrentDataDisplay
    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.updateData(enteredText);
    }
}
