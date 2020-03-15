package com.android.tasks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_taskshow, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task1 = DataManager.get(position);
        holder.show.setText(" " + task1.task);
    }

    @Override
    public int getItemCount() {
        return 0;
    }




    public class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView show;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            show = itemView.findViewById(R.id.tv1);
        }
    }
}