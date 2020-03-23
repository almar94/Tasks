package com.android.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    final int CODE = 2594;
    Button addNewTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.Recycler11);
        rv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        FragmentManager manager = getSupportFragmentManager();
        RecyclerView.Adapter adapter = new TaskAdapter(manager);
        rv.setAdapter(adapter);

        addNewTask = findViewById(R.id.buttonAdd);

        addNewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Taskadd.class);
                startActivityForResult(intent, CODE);
            }
        });

        Button showTaskBtn = findViewById(R.id.showTask_btn);
        if (showTaskBtn != null) {
            showTaskBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    MainFragment fragment = new MainFragment();
                    transaction.add(R.id.fragment_container, fragment).addToBackStack("").commit();

                }
            });
        }
    }

}
