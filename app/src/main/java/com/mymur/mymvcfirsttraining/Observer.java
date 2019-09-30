package com.mymur.mymvcfirsttraining;


//интерфейс наблюдателя

import android.widget.TextView;

public interface Observer {
    void updateData(String enteredText);
}
