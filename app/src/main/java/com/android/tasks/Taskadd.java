package com.android.tasks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Taskadd extends AppCompatActivity {
    EditText ed, status;
    FloatingActionButton addANDShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd);

        ed = findViewById(R.id.editTextAdd);
        status = findViewById(R.id.editTextStatus);
        addANDShow = findViewById(R.id.floating_action_button);

        addANDShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newTask = ed.getText().toString();


                Execution myNewStatusTask = Execution.getExecution(status.getText().toString().trim());
                final Task task = new Task(newTask, myNewStatusTask);


                AlertDialog.Builder alert = new AlertDialog.Builder(Taskadd.this);
                alert.setTitle("Your task is");
                alert.setMessage(newTask);
                alert.setCancelable(false);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        DataManager.allTasksArrayList.add(task);
                        Intent intent = new Intent(Taskadd.this, MainActivity.class);
                        startActivity(intent);


                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Taskadd.this, "Your clicked cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();

            }

        });


    }
}
