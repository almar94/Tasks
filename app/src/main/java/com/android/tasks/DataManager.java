package com.android.tasks;

import java.util.ArrayList;

public class DataManager {

    ArrayList<Task> taskArrayList = new ArrayList<>();
    ArrayList<Task> allTasksArrayList = new ArrayList<>();

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public ArrayList<Task> getAllTasksArrayList() {
        return allTasksArrayList;
    }

    public void setAllTasksArrayList(ArrayList<Task> allTasksArrayList) {
        this.allTasksArrayList = allTasksArrayList;
    }
}
