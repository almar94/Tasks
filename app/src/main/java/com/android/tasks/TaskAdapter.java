package com.android.tasks;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private final FragmentManager manager;

    public TaskAdapter(FragmentManager manager){
        this.manager = manager;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_taskshow, parent, false);
        return new TaskViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, final int position) {
        final Task task1 = DataManager.allTasksArrayList.get(position);
        holder.show.setText(" " + task1.getTask());

        holder.status.setText(task1.getTaskStatus().name());
        switch (DataManager.allTasksArrayList.get(position).getTaskStatus()) {
            case TO_DO:
                holder.status.setTextColor(Color.RED);
                break;
            case IN_PROGRESS:
                holder.status.setTextColor(Color.BLACK);
                break;
            case COMPLETED:
                holder.status.setTextColor(Color.GREEN);
                break;
        }
        holder.showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = manager.beginTransaction();
                MainFragment fragment = new MainFragment(""+task1.getTask(), ""+task1.getTaskStatus());
                transaction.replace(R.id.fragment_container, fragment).addToBackStack("pos").commit();
            }

        });
    }

    @Override
    public int getItemCount() {
        return DataManager.allTasksArrayList.size();
    }


    public class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView show, status;
        Button showBtn;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            show = itemView.findViewById(R.id.tvShow);
            status = itemView.findViewById(R.id.st);
            showBtn = itemView.findViewById(R.id.showTask_btn);

        }
    }
}
