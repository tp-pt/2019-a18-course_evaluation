package com.scottmangiapane.courseevaluation.ui.my_info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyInfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyInfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myinfo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}