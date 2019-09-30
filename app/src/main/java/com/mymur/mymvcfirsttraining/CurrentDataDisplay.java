package com.mymur.mymvcfirsttraining;

import android.content.Context;
import android.widget.TextView;


//Этот класс выступает как View

public class CurrentDataDisplay implements Observer{
    MyModel myModel;
    TextView textView;



public CurrentDataDisplay(MyModel myModel, TextView textView) {
    this.myModel = myModel;
    this.textView = textView;
}

//обновим текствью новыми данными из модели
    @Override
    public void updateViewData(String enteredText) {
        textView.setText(enteredText);
    }
}
