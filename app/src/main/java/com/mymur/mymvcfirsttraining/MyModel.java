package com.mymur.mymvcfirsttraining;

//Класс будет как Модель данных

import com.mymur.mymvcfirsttraining.interfaces.Observable;
import com.mymur.mymvcfirsttraining.interfaces.Observer;

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
        System.out.println("Наблюдатель добавлен");
    }

    @Override
    public void removeObserver(Observer newObserver) {
        observers.remove(newObserver);
    }

    //метод обновляет данные методом "updateData" из класса-наблюдателя CurrentDataDisplay
    @Override
    public void notifyObservers() {

        //РАБОТЕТ 1
        for (Observer observer : observers)
            observer.updateViewData(myText);
        System.out.println("Это notifyObservers "+ myText);
    }

    @Override
    //РАБОТЕТ 2
    public void changeData(String newEnteredText){
        myText = newEnteredText;
        System.out.println("Это Model changeData "+ myText);
        //теперь обновим данные у наблюдателей
        notifyObservers();
    }
}
