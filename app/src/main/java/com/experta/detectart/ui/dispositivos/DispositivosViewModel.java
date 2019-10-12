package com.experta.detectart.ui.dispositivos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DispositivosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DispositivosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}