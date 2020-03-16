package com.android.tasks;

import java.util.ArrayList;

public class DataManager {


   static ArrayList<Task> allTasksArrayList = new ArrayList<>();

    public ArrayList<Task> getAllTasksArrayList() {
        return allTasksArrayList;
    }

   public void setAllTasksArrayList(ArrayList<Task> allTasksArrayList) {
        this.allTasksArrayList = allTasksArrayList;
    }
}
