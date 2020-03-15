package com.android.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Taskadd extends AppCompatActivity {
    EditText ed;
    FloatingActionButton addANDShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd);

        ed =findViewById(R.id.editTextAdd);
        addANDShow=findViewById(R.id.floating_action_button);

        addANDShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  newTask = ed.getText().toString();
                Bundle Bundle1 = new Bundle();
                Intent intent = new Intent(Taskadd.this, MainActivity.class);
                Bundle1.putString("newTask", newTask);
                intent.putExtra("Bundle1", Bundle1);
                startActivity(intent);
            }
        });


    }
}
