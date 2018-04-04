package com.rackspira.dos_a.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.rackspira.dos_a.R;

/**
 * Created by iTPix on 4/4/2018.
 */

public class MatkulFragment extends android.support.v4.app.Fragment {

    private AppCompatSpinner spinnerSemester;

    public MatkulFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matkul,container,false);

        spinnerSemester = (AppCompatSpinner)view.findViewById(R.id.spinner_semester);
        ArrayAdapter<CharSequence> spinneAdapter = ArrayAdapter.createFromResource(
                getContext(),
                R.array.pilihan,
                R.layout.support_simple_spinner_dropdown_item
        );
        spinnerSemester.setAdapter(spinneAdapter);

        return view;
    }
}
