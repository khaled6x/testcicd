package com.redspot.grocerysd.fragments;

import androidx.annotation.Nullable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.redspot.grocerysd.R;


public class Intro_Slide_3 extends Fragment {
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.intro_slide_3, container, false);
        
        return rootView;
    }
}

