package com.scottmangiapane.courseevaluation.ui.footprint;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FootPrintViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FootPrintViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is footprint fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}