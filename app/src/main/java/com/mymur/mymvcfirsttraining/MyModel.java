package com.mymur.mymvcfirsttraining;

//Класс будет как Модель данных

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyModel implements Observable {
//ИМЕННО ЗДЕСЬ важно указать тип переменных в List-e
    private List <Observer> observers;
    private String myText;


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
            observer.updateViewData(myText);
    }

    @Override
    public void changeData(String newEnteredText){
        myText = newEnteredText;
        //теперь обновим данные у наблюдателей
        notifyObservers();
    }
}
