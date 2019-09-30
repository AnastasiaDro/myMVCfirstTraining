package com.mymur.mymvcfirsttraining;

import android.widget.TextView;

import com.mymur.mymvcfirsttraining.interfaces.Observer;


//Этот класс выступает как View

public class CurrentDataDisplay implements Observer {
    MyModel myModel;
    TextView textView;



public CurrentDataDisplay(MyModel myModel, TextView textView) {
    this.myModel = myModel;
    this.textView = textView;
    myModel.registerObserver(this);
}

//обновим текствью новыми данными из модели
    @Override
    public void updateViewData(String enteredText) {
        textView.setText(enteredText);
        System.out.println("Это Current data display "+ enteredText);
    }
}
