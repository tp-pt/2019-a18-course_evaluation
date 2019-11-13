package com.scottmangiapane.courseevaluation.ui.footprint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.scottmangiapane.courseevaluation.R;

public class FootPrintFragment extends Fragment {

    private FootPrintViewModel footprintViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        footprintViewModel =
                ViewModelProviders.of(this).get(FootPrintViewModel.class);
        View root = inflater.inflate(R.layout.fragment_footprint, container, false);
        final TextView textView = root.findViewById(R.id.text_footprint);
        footprintViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}