package com.android.tasks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private String title, description;

    public MainFragment() {
        // Required empty public constructor
        getView();
    }

    public MainFragment(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView taskTitle = view.findViewById(R.id.showTitle_TV);
        taskTitle.setText(title);
        TextView taskDesc = view.findViewById(R.id.shoeDesc_TV);
        taskDesc.setText(description);
        return view;
    }
}
