package com.example.examenprimerapartediego;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

public class GridFragment extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grid_fragamente,container,false);
        GridView gv = (GridView) view.findViewById(R.id.grilla);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.paises, android.R.layout.simple_list_item_1);
        gv.setAdapter(arrayAdapter);
        return view;
    }
}
