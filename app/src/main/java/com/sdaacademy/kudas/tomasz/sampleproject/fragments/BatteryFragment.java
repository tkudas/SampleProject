package com.sdaacademy.kudas.tomasz.sampleproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdaacademy.kudas.tomasz.sampleproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BatteryFragment extends Fragment {


    public BatteryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_battery, container, false);
    }

}
