package com.android.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final int CODE = 2594;
    Button addNewTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNewTask = findViewById(R.id.buttonAdd);

        addNewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Taskadd.class);
                startActivityForResult(intent, CODE);
            }
        });

        RecyclerView rv = findViewById(R.id.Recycler11);
        final TaskAdapter adapter = new TaskAdapter();
        rv.setAdapter(adapter);

    }
}
