package com.android.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Taskadd extends AppCompatActivity {
    EditText ed;
    Button addANDshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd);

        ed =findViewById(R.id.editTextAdd);
        addANDshow=findViewById(R.id.floating_action_button);

        addANDshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task;
                String newTask = ed.getText().toString();
            }
        });


    }
}
